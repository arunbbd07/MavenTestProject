package com.arun.apiautomation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.arun.fileinout.ExcelReadWriteClass;

public class MySQLDataFetching {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://52.52.251.75/munch?useSSL=false";

	// Database credentials
	static final String userName = "munchado";
	static final String password = "MunchAdo@2017";
	Connection con = null;
	Statement stmt = null;
   // netcore url: https://api.netcoresmartech.com/v1/activity/singleactivity/ADGMOT35CHFLVDHBJNIG50K968IHHKCDLJANN9CGBV4A433SLPDG 
	public static void main(String[] args) {
		MySQLDataFetching obj= new MySQLDataFetching();
		obj.fetchData50Transactions();

	}

	void fetchData50Transactions() {
		try {
			// Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");
			// Open connection
			con = DriverManager.getConnection(DB_URL, userName, password);
			stmt = con.createStatement();
			String query = "select deal_id, account, sum(transaction) as transaction, CONCAT(month(DATE), year(DATE)) AS `mmyyyy` from transaction_revenue_dealID where CONCAT(month(DATE), year(DATE)) = CONCAT(month(current_date), year(current_date)) group by CONCAT(month(DATE), year(DATE)), deal_id, account having sum(transaction) >=50";
			ResultSet resultSet = stmt.executeQuery(query);
			// Extract data from result set
			resultSet.last();
            int totalRecords= resultSet.getRow();
            resultSet.beforeFirst();
            System.out.println("Total Accounts data fetched: "+totalRecords);
            HashMap<String,Integer> hashMapTrans=new HashMap<String,Integer>();
            int i=1;
			while (resultSet.next()) {
				// Retrieve by column name
				long dealId = resultSet.getLong("deal_id");
				String accountName = resultSet.getString("account");
				int totalTransaction = resultSet.getInt("transaction");
				String monthName = resultSet.getString("mmyyyy");
               hashMapTrans.put(accountName, totalTransaction);
               // Starts--Program to write all records in excel
               try{
           		File file= new File(System.getProperty("user.dir")+"\\resources\\TestData.xlsx"); 
           		//File file= new File("D:\\Selenium\\POM_Project\\resources\\TestData.xlsx");
           		FileInputStream fis=new FileInputStream(file);
           		
           		@SuppressWarnings("resource")
				XSSFWorkbook wb=new XSSFWorkbook(fis);
           		XSSFSheet sh= wb.getSheet("Transactions");
           		
           		//for(int i = 1; i < totalRecords ; i++) 
           		{
           		    sh.createRow(i);
           		  for(int j = 0; j <=3; j++) { 
           		        sh.getRow(i).createCell(j); 
           		        if(j==0)
           		        {
           		        sh.getRow(i).createCell(j).setCellValue(dealId);
           		        
           		        }
           		        else if(j==1)
           		        {
           		        	sh.getRow(i).createCell(j).setCellValue(accountName);
           		        }
           		        else if(j==2)
           		        {
           		        	sh.getRow(i).createCell(j).setCellValue(totalTransaction);
           		        }
           		        else
           		        {
           		        	sh.getRow(i).createCell(j).setCellValue(monthName);
           		        }
           		    }
           		 
           		}     
           			
           		fis.close();
           		FileOutputStream fos= new FileOutputStream(file);
           		wb.write(fos);
           		fos.close();
           		i++;
           		}
               
           		catch(Exception e)
           		{
           			e.printStackTrace();
           		}
             }
			
			System.out.println("========printing the HashMap Data=================");
			//hashMapTrans.forEach((k,v)-> System.out.println("Account Name="+k+",Total Transactions="+v));
			System.out.println("Map data entries # "+hashMapTrans.size());
			for(Map.Entry<String, Integer> entry:hashMapTrans.entrySet())
			{
				System.out.println(entry.getKey()+"="+entry.getValue());
			}
			resultSet.close();

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			
			try
			{
				if(con!=null)
				{
					con.close();
				}
				//SendingEmail.sendEmail();
				
			}
			catch(Exception fe)
			{
				fe.printStackTrace();
			}

		}
		System.out.println("The exceution has been ended!!!");
	
	}

	
}

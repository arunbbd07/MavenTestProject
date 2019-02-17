package com.arun.fileinout;

import java.io.File;

public class FileExistence {

	public static void main(String[] args) {
		FileExistence obj= new FileExistence();
		obj.filepresent();

	}
	
	void filepresent()
	{
		File file=new File("/Python/");
		boolean present=file.exists();
		System.out.println(present);
		if(file.exists())
		{
			System.out.println("File last modified is: "+ file.lastModified());
			System.out.println("File path is: "+file.getAbsolutePath());
			System.out.println("File free space: "+ file.getFreeSpace());
			System.out.println("File parent file: "+ file.getName());
		}
		
	}

}

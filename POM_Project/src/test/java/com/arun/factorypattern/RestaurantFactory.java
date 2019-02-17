package com.arun.factorypattern;

public class RestaurantFactory {

	public Restaurant getRestaurantType(String type) throws Exception {
		
		if (type.toLowerCase().equals("caffe")) 
		{
			return new Caffe();
		} 
		else if (type.toLowerCase().equals("finedine"))
		{
			return new FineDine();
		} 
		else if (type.toLowerCase().equals("pizzeria"))
		{
			return new Pizzeria();
		}
		else if(type.toLowerCase().equals("ethinic"))
		{
			return new Ethinic();
		}
		else {
			
			throw new Exception("This is the not valid Restaurant Type, please select valid rest type!!");

		}
	
	}

}

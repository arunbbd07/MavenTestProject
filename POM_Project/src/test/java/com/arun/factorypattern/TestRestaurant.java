package com.arun.factorypattern;

public class TestRestaurant {

	public static void main(String[] args) throws Exception {
		RestaurantFactory factory=new RestaurantFactory();
		//Superclass obj= new Subclass();
		Restaurant restobj1= factory.getRestaurantType("caffe");
		restobj1.packageType();
		//System.out.println(restobj1.packageType());
		Restaurant restobj2=factory.getRestaurantType("pizzeria");
		restobj2.packageType();
		//System.out.println(restobj2.packageType());
		Restaurant restobj3=factory.getRestaurantType("finedine");
		restobj3.packageType();
		//System.out.println(restobj3.packageType());
		Restaurant restobj4=factory.getRestaurantType("ethinic");
		restobj4.packageType();
		//System.out.println(restobj4.packageType());
		/*Restaurant restobj5=factory.getRestaurantType("Kosher");
		restobj5.packageType();*/
	}

}

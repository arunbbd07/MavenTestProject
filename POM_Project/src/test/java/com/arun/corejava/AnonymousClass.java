package com.arun.corejava;

public class AnonymousClass {
	
	interface Eatable{  
		 void eat();  
		}  
		static class TestAnnonymousInner1{  
		 public static void main(String args[]){  
		 Eatable e=new Eatable(){  
		  public void eat(){System.out.println("nice fruits");}  
		 };  
		 e.eat();  
		 }  
		}  

}

package com_qa_basics_General;

public class staticblockandmethod {
	
	static String i = "i am in static block";
	
	  static void method(){  
		  System.out.println("iam in static method");
	  } 
		     
	public staticblockandmethod(){
		System.out.println("iam in constructor");
	}
	public static void main(String[] args) {
		staticblockandmethod.method();
	    System.out.println(staticblockandmethod.i);
		staticblockandmethod a = new staticblockandmethod();
		
	}

}

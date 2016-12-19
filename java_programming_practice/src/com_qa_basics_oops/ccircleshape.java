package com_qa_basics_oops;

public class ccircleshape extends cshape implements cshapeconstants{

	 
	   public void area(int radius)
	   {
			
		   System.out.println("Area of Circle using interface method " + pi * radius * radius);
		  
	   }
	   
	//override
	   public  double preimer(double radius) 
	   {
		
		 System.out.println("Area of circle using abstract class:" + 2*pi*radius);
		  return radius;
	   }
	   public static void main(String args[]){
		     ccircleshape obj = new ccircleshape();
		    
		   obj.preimer(5);
		   obj.area(4);
		  }
	   
	   }
	   
	   





package com_qa_basics_oops;

public class arectangleshape extends aabstractshape {

	private final double width, length; 
		public  arectangleshape(){
			this(1,1);
		}
		public arectangleshape(double width, double length) {
	        this.width = width;
	        this.length = length;
	    }
		 public double area() {
		        
		        return width * length;
		    }
		
		 public double perimeter() {
		       
		        return 2 * (width + length);
		    }
	}
	

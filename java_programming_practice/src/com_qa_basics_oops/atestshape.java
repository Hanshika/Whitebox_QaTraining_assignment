package com_qa_basics_oops;

public class atestshape {
public static void main(String[] args) {
		 double width = 5, length = 7;
		 aabstractshape rectangle = new arectangleshape(width, length);
	        System.out.println("Rectangle width: " + width + " and length: " + length
	                + "\nResulting area: " + rectangle.area()
	                + "\nResulting perimeter: " + rectangle.perimeter() + "\n");
	}

}

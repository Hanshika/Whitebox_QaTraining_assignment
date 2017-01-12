package com_qa_basics_File;
import java.io.*; 
import java.io.Console;

public class consoleclassfile {

	
	public static void main(String[] args) {
		int x,y,z;
		Console c=System.console();  
		  System.out.println("Enter two integers");
		  x=Integer.parseInt (c.readLine());
		y=Integer.parseInt (c.readLine());
	z=x/y;
		  System.out.println("divide of entered integers ="+z);
	}

}

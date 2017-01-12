package com_qa_basics_File;
import java.io.*;
import java.util.Scanner;
public class scannerinput {

	
	public static void main(String[] args) {
		 int x, y, z;
	      System.out.println("Enter two integers");
	      Scanner in = new Scanner(System.in);
	      x = in.nextInt();
	      y = in.nextInt();
	      z = x + y;
	      System.out.println("Sum of entered integers = "+z);
	   } 
		 

	}



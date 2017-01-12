package com_qa_basics_loops;

import java.util.Scanner;

public class factorial {

	
	public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	System.out.println("enter the number  factorial is :");
	int n=scanner.nextInt();
	int result =factorial(n);
	System.out.println("the factorial od "+n+"is "+result);
	}
	public static int factorial(int n){
		int result =1;
		for (int i=n;i>=1;i--){
			result =result *i;
		}
		return result;
		}
		

	}



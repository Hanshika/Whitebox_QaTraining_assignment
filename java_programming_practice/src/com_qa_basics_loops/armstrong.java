package com_qa_basics_loops;

public class armstrong {

	public static void main(String[] args) {
		 
		    int c=0,a,temp;  
		    int n=407;//It is the number to check armstrong  
		    temp=n;  
		    while(n>0)  
		    {  
		    a=n%10;  
		    n=n/10;  
		    c=c+(a*a*a);  
		    }  
		    if(temp==c)  
		    System.out.println("armstrong number");   
		    else  
		        System.out.println("Not armstrong number"); 

	}

}

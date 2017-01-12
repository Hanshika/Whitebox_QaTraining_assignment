package com_qa_basics_Strings;

public class reverse {

	
	
	public static void main(String[] args) {
		String str= "hello";
		 String reverse = " ";
		 int length = str.length();
	/*String a[]=str.split("  ");
		for (int i=0;i<a.length;i++)
		{
			
		
		System.out.println(a[i] +"  ");
	
	}
		System.out.println("");
		
		for (int j=a.length-1;j>=0;j--){
			
			System.out.println(a[j]+"");
		}*/
		
		
		 for (int i = length - 1; i >= 0; i--)
			 reverse = reverse + str.charAt(i);
			System.out.println(reverse);
		 
	}


}

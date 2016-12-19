package com_qa_basics_arrays;

public class linearsearch {

	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6,7};
		int b=7;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b){
				System.out.println("looking number is ;"+a[i]);
				break;
		
			}
		}

	}
}



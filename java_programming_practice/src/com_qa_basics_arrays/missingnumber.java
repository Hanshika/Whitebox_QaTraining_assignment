package com_qa_basics_arrays;

public class missingnumber {
public static void main(String[] args) {
		int number[]= {1,2,3,4,5,6,7,8,10};
		
		int k =number[0];
		for (int i=0;i<number.length;i++){
			if(k==number[i])
       {
				k++;
				continue;
			}
			else{
				System.out.println("missing numbers are "+k);
			}
		}
	
	
	}}

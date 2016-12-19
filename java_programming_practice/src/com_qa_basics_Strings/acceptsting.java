package com_qa_basics_Strings;

public class acceptsting {

	
	public static void main(String[] args) {
		String s="this is nice";
		String s1="1 2 3";
		StringBuffer Buffer =new StringBuffer();
		String[] str =s.split(" ");
		String[] str1 =s1.split(" ");
		for(int i=0;i<str.length;i++){
			Buffer.append(str[i]);
			Buffer.append(str1[i]);
		  }
		System.out.println("\n original string:"+s);
		System.out.println("\n converts string:"  +Buffer.toString());
	}
	
	}



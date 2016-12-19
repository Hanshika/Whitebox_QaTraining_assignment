package com_qa_basics_Exception_Handling;

public class nullpointerexception {

	public static void main(String[] args) {
	String s=null;
		
	try{
		System.out.println(s.toString());  
	}
catch(NullPointerException e){
	System.out.println(e);
}
	finally{
		System.out.println("finally block is always executed");
		
	}
	}

}

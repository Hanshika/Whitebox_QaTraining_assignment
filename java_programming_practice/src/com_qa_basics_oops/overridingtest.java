package com_qa_basics_oops;

public class overridingtest extends overriding {

	//override
	public int voteage()
	{
		return 18;
	}
	
	
	public static void main(String[] args) {
	
		overriding obj=new overridingtest();
		int num=obj.voteage();
	System.out.println("vote for age is: "+num);
	}

}

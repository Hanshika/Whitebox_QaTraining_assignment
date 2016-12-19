package com_qa_basics_loops;

public class pingpong {

	public static void main(String[] args) {
	for (int i=1;i<50;i++)
	{
	if (i%3 == 0)
	{
		System.out.println("ping");
		
	}
	
if (i%5==0)
{
	System.out.println("pong");
}
if ((i%3 == 0) && (i%5 == 0))
{
	System.out.println("ping pong");
	
}
	if ((i%3 != 0) && (i%5 !=0))
	{
		System.out.println("i");
	}
	}
	}
	}

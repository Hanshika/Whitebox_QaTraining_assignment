package com_qa_basics_loops;

public class patternwords {

	
	public static void main(String[] args)
	{

		for (int i =0; i < 6; i++)
        {
            for (int j=0; j < i+1; j++)
            {
                System.out.print('*');
            }
            System.out.println();
        }
	}

}

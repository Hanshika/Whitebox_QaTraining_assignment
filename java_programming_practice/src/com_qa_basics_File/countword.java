package com_qa_basics_File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class countword {

	
	
	    public static void main (String[] args)
	    {

			
	try
	{
		FileReader fileReader = new FileReader("H:/Users/Hanshika/gomathy_java/hanish/src/com_qa_basics/myfile.txt");
		
		BufferedReader br = new BufferedReader(fileReader);
	    String line ;
		
		 
    int count=0;
		 
		while (( line = br.readLine()) != null)
		 {
		    
			//System.out.println("Read line" + line);
			String [] a  = line.split(" ");
			count += a.length;
		   
		 }
		System.out.println("Total no of words in the file = " +count);
		 }
		     catch (IOException e)
				{
					System.out.println ("Unable to read from file");
					
				}
	    }
}
		 
	
	   
		 
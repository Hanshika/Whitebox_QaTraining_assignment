package com_qa_basics_File;
import java.io.*;

public class listfile {

	
	public static void main(String[] args) {
		{
			try
			{
				File file = new File("H:/Users/Hanshika/gomathy_java/java_programming_practice/src/com_qa_basics_arrays");
				File[] listOfFiles = file.listFiles();
				
				System.out.println("Below are the file names in "+file+"\n");	
				for (int i = 0; i < listOfFiles.length; i++) 
				{
				     
					System.out.println(listOfFiles[i].getName());
				    
	}
			}
			catch(Exception e)
			{
				System.out.println("end of line");
			}
			}
		
		}
	}
		




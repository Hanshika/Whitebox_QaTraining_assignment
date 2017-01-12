package com_qa_basics_Collection;
import java.util.* ;
public class inputseries {
	public static void main(String[] args) {
		 String[] a={"a1","a2","a3","b1","b2","b3"};
		 ArrayList a1 = new ArrayList();
		 ArrayList a2 = new ArrayList();
		 for(int i=0; i< a.length; i++)
		 {
			  for (String retval1: a[i].split("[0-9]"))
			  	{
				  String abc =retval1.replaceAll("\\s","");
					  a1.add(abc);			  	  
			      }
			  for (String retval: a[i].split("[a-z]")) 
			  	{
				  String cde =retval.replaceAll("\\s","");
					  a2.add(cde);
			      }
		}
		 a2.removeAll(Arrays.asList("", null));
		 HashSet hs = new HashSet();
		 hs.addAll(a1);
		 
	     HashSet hs1 = new HashSet();
		 hs1.addAll(a2);

		 String[] strArr1 = new String[hs.size()];
	     hs.toArray(strArr1);

		 String[] strArr2 = new String[hs1.size()];
	     hs1.toArray(strArr2); 
	     
	     System.out.print("The generated output series : ");     
		 for(int xy=0; xy< strArr2.length; xy++)
		 	{ 
			 for(int z=0; z< strArr1.length; z++){
		    	   System.out.print(strArr1[z]);
		    	   System.out.print(strArr2[xy]+ ",");
		    	}
	    	}
	} 	  
}
	

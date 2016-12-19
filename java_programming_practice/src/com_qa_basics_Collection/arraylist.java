package com_qa_basics_Collection;
import java.util.* ;
import java.util.ArrayList;



public class arraylist {

	
	public static void main(String[] args) {
		
		  
		    // Create an ArrayList that holds references to String
		    ArrayList<String> names = new ArrayList<String>();

		 

		    // Add list objects
		    names.add("Amy");
		    names.add("Bob");
		    names.add( "Chris" );   
		    names.add( "Deb" );
		    names.add( "Elaine" );  
		    names.add( "Joe" );

	
		       
		    // Access and print out the Objects
		  /*  for ( int j=0; j<names.size(); j++ ) // add elements
		      System.out.println("element " + j + ": " + names.get(j) );*/

		   // System.out.println( "Search element: " + names.indexOf( "Elaine" ) );     // search element in the list
		    
		   /* Iterator<String> iter = names.iterator();read list line by line
		    while ( iter.hasNext() )
		        System.out.println( iter.next() );*/
		    ListIterator iter = names.listIterator(names.size()); // add sets() and add the list in one method

		    while (iter.hasPrevious()) { //method use for current position
		      System.out.println(iter.previous());

	}

}
}

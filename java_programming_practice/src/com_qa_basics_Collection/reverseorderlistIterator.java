package com_qa_basics_Collection;
import java.util.* ;

public class reverseorderlistIterator {

	
	public static void main(String[] args) {
		 List list = new LinkedList();
		    list.add("A");
		    list.add("B");
		    list.add("C");
		    list.add("D");

		    ListIterator iter = list.listIterator(list.size());

		    while (iter.hasPrevious()) {
		      System.out.println(iter.previous());
		    }

	}

}

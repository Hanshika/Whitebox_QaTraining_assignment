package com_qa_basics_arrays;
import java.util.* ;

public class merge {

	public static void main(String[] args) {
		String a[] = { "A", "P", "P" };
	      String b[] = { "L", "E" };
	      List list = new ArrayList(Arrays.asList(a));
	      list.addAll(Arrays.asList(b));
	      Object[] c = list.toArray();
	      System.out.println(Arrays.toString(c));
	   }
	}



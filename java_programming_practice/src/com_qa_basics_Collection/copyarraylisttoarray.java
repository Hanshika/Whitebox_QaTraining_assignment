package com_qa_basics_Collection;

import java.util.* ;

public class copyarraylisttoarray {

	
	public static void main(String[] args) {
	List<Integer>list =new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(300);
		Integer[]tempArray = new Integer[list.size()];
		list.toArray(tempArray);
		System.out.println(tempArray[0]);
		System.out.println(tempArray[1]);
		System.out.println(tempArray[2]);
	}

}

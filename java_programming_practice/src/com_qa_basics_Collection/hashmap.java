package com_qa_basics_Collection;
import java.util.* ;
public class hashmap {

	public static void main(String[] args) {
	  {
		  HashMap<Integer,String> myMap = new HashMap<>();
		  myMap.put(100, "amit");
		  myMap.put(101, "bharti");
		  myMap.put(102, "sampath");
		  myMap.put(103, "ruby");
		  System.out.println(myMap.size());
		  
		  System.out.println(myMap.get(102));
	}

}
}

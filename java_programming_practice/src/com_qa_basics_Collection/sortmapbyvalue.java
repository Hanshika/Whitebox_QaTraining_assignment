package com_qa_basics_Collection;
import java.util.* ;
public class sortmapbyvalue {

	
	public static void main(String[] args) {
		 Map<String, String> yourMap = new HashMap<String, String>();
		 yourMap.put("1", "one");
		    yourMap.put("4", "four");
		    yourMap.put("3", "three");
		    yourMap.put("2", "two");
		   
			//  System.out.println( yourMap);
		    Set set2 = yourMap.entrySet();
		    Iterator iterator1 =  set2.iterator();    
		    while(iterator1.hasNext()) {
		           Map.Entry a = (Map.Entry)iterator1.next();
		            
		           System.out.println(a.getValue());
		    }
	}

}

package com_qa_basics_Collection;
import java.util.* ;
public class enummonth {

	
	public static void main(String[] args) {
		Enumeration days;
	      Vector dayNames = new Vector();
	      dayNames.add("JANUARY");
	      dayNames.add("FEBRUARY");
	      dayNames.add("MARCH");
	      dayNames.add("APRIL");
	      dayNames.add("MAY");
	      dayNames.add("JUNE");
	      dayNames.add("JULY");
	      dayNames.add("AUGUST");
	      dayNames.add("SEPTEMBER");
	      dayNames.add("OCTOBER");
	      dayNames.add("NOVEMBER");
	      dayNames.add("DECEMBER");
	      days = dayNames.elements();
	      
	      while (days.hasMoreElements()) {
	         System.out.println(days.nextElement()); 
	      }

	}

	}
	

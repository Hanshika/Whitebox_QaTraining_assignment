package com_qa_basics_Strings;

import java.util.Scanner;
import java.util.Stack;

public class parenthesis {

	 private String brackets;
	 
	    public parenthesis (String s) {
	        brackets = s;
	    }
	 public boolean validate() {
	        boolean result = true;
	          Stack<Character> stack = new Stack<Character>();
	        char c, p;
	        for(int i = 0; i < this.brackets.length(); i++) {
	            c = this.brackets.charAt(i);
	            if(c == '(' ) {
	                stack.push(c);
	            } else if(c== ')') 
	            {
	                if(stack.isEmpty())
	                {
	                    result = false;
	                    } else 
	                {
	                    p = stack.peek(); // looking obj at the top of stack
	                    if((c == ')' && p == '(')) {
	                        stack.pop();
	                    } else {
	                        result = false;
	                     }
	                }
	            }
	        }
	        if(!stack.isEmpty()) {
	            result = false;
	           
	            }
	     return result;
	    }
		 
		
		
		
		
		
		
	

}

package com_qa_basics_General;

public final class immutableclass {
            private final String name; // by created final class those two object can not be modified
		    private final String mobile;

		    public  immutableclass(String name, String mobile) {
		        this.name = name;
		        this.mobile = mobile;
		    }
		  
		    public String getName(){
		        return name;
		    }
		  
		    public String getMobile(){
		        return mobile;
		    }
		



	}



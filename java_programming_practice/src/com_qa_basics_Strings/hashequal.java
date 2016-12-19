package com_qa_basics_Strings;

public class hashequal {
private int age ;
			public hashequal(int age)
			{
				super();
				this.age = age;
			}
			
			public int hashCode()
			{
				return age;
			}
			
			public boolean equals( Object obj )
			{
				boolean flag = false;
				hashequal a = ( hashequal )obj;
				if( a.age == age )
					flag = true;
				return flag;
			}
			
			public static void main(String[] args) {
				
				hashequal a1 = new hashequal(23);
				hashequal a2 = new hashequal(40);
				System.out.println("a1.equals(a2)--->>>"+a1.equals(a2));
				int n1=System.identityHashCode(a1);
				int n2=System.identityHashCode(a2);
				System.out.println("original hashcode a1 ------>>>"+n1);
				System.out.println("original hashcode a2 ------>>>"+n2);
		}
}



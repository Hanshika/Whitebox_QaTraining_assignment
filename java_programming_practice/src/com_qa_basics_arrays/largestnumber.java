package com_qa_basics_arrays;

public class largestnumber {
public static void main(String[] args) {
		int[] numbers = {88,33,55,23,64,123};

	int largest =numbers[0];
	for (int i=0;i<numbers.length;i++){
		if(numbers[i] > largest) {
			 largest = numbers[i];
		}
	}
System.out.println("largest number is:"+largest);
	}

}

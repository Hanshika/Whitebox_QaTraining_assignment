package com_qa_basics_Strings;

public class replace {

	
	public static void main(String[] args) {
		String s="hi how are you";
		String[] words=s.split(" ");
		String replace="what";
for(int i=0;i<words.length;i++){
	String word=words[i];
	if(word=="how"){
		s.replaceAll(word, replace);
		break;
	}
   System.out.println(s);
	}

}
}
package com.strings.practice;

public class UppercaseLowercaseCount {

	public static void main(String[] args) {
		int upperCaseCount=0;
		int lowerCaseCount=0;
	String s="Hello There! How are You";
	char[] c= s.toCharArray();
	for(int i=0;i<c.length;i++) {
		if(c[i]>='A' && c[i]<='Z') {
			
			upperCaseCount++;
		}
		if(c[i]>='a' && c[i]<='z') {
			
			lowerCaseCount++;
		}
		
		
	}
	System.out.println(upperCaseCount);
	System.out.println(lowerCaseCount);
	

	}

}

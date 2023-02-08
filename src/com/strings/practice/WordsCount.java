package com.strings.practice;

public class WordsCount {

	public static void main(String[] args) {
		String text="hello javatpoint this is wcc tool";  
		String words[]=text.split("\\s");  
		int length=words.length;//returns total number of words  
		int clength=text.length();//returns total number of characters with space  
		System.out.println("WordsLength: "+length);
		System.out.println("CharLength: "+clength);
}
}

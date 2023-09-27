package com.stream.practice;

public class StringPalindrome {

	public static void main(String[] args) {

		String str = "mangnam";
		String reverse="";
		
		for(int i=0; i<str.length(); i++){
			reverse=str.charAt(i)+reverse;
		}
		if(str.equals(reverse)) {
			System.out.println("String is palindrome");
		}else{
			System.out.println("String is not palindrome");

		}
	}

}

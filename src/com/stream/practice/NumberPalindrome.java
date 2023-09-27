package com.stream.practice;

public class NumberPalindrome {

	public static void main(String[] args) {
		int num=2522;
		int originalNumber= num;
		int reverse=0;
		
		while(num>0){
			
			int number = num%10;
			reverse = reverse*10+number;
			num = num/10;
		}
		if(originalNumber==reverse) {
			System.out.println("Number is palindrome");
		}else {
			System.out.println("Number is not palindrome");
		}
	}

}

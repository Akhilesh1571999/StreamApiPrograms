package com.stream.api;

public class Palindrome {
	
	public static void main(String[] args) {
		
		int num = 2522;
        int originalNum = num; 
        int reverse = 0;

        while (num > 0) {
            int number = num % 10;
            reverse = reverse * 10 + number;
            num = num / 10;
        }

        if (originalNum == reverse) {
            System.out.println("Number is a palindrome");
        } else {
            System.out.println("Number is not a palindrome");
        }
    }
}

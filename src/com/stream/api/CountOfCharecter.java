package com.stream.api;

public class CountOfCharecter {

	public static void main(String[] args) {

		String input = "hello world";
		
		char character = 'l';
		
		long count = input.chars().filter(n->n ==character).count();
		
		System.out.println(count);
	}

}

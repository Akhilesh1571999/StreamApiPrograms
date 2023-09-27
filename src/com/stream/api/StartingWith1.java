package com.stream.api;

import java.util.Arrays;
import java.util.List;

public class StartingWith1 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(20,25,17,18,88,96,19,200);
		
	
		list.stream().map(n->n +"")
		.filter(s-> s.startsWith("2")).forEach(System.out::println);
	}

}

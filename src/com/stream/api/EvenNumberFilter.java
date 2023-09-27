package com.stream.api;

import java.util.Arrays;
import java.util.List;

public class EvenNumberFilter {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,29,31,14,17,67,68);
		
		list.stream().filter(n->n%2==0).forEach(System.out::println);
		
	}

}

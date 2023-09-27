package com.stream.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumberStartsWith1 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(15,24,75,10,17,155,87,109);
		Set<Integer> nos = new  HashSet<Integer>();
		
		numbers.stream().map(s->s+"").filter(n->n.startsWith("1")).forEach(System.out::println);
	}

}

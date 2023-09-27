package com.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringCount {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Aniket","Anil","Suyesh","Kunal","rakesh","Anu");

		long count = names.stream().filter(s->s.length()>4).count();
		System.out.println("Count>> " +count);
		
		 List<String> collect = names.stream().filter(n->n.length()>4).collect(Collectors.toList());

		
		System.out.println("list>>"+collect);
	}

}

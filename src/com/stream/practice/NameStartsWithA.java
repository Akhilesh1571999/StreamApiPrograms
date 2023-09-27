package com.stream.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class NameStartsWithA {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Aniket","Sahil","Rakesh","Akash");
		
		names.stream().filter(n->n.startsWith("A")).collect(Collectors.toList())
		.forEach(System.out::println);
	
	}
}

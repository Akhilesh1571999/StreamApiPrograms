package com.stream.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmptyStringCount {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Aniket","","Sahil","Rakesh","");

		 long count = names.stream().filter(n->n.isEmpty()).count();
		System.out.println(count);

	}

}

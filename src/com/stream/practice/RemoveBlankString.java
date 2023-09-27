package com.stream.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveBlankString {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Aniket","","Sahil","Rakesh","");

		names.stream().filter(n->!n.isEmpty()).collect(Collectors.toList())
		.forEach(System.out::println);
	}

}

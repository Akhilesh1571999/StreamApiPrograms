package com.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveEmptyString {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Aniket","","Suyesh","","rakesh");

		List<String> collect = names.stream().filter(n->!n.isEmpty())
				.collect(Collectors.toList());
		
		System.out.println(collect);
	}

}

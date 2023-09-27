package com.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmptyString {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Aniket","","Suyesh","","rakesh");
				
		 long count = names.stream().filter(s->s.isEmpty()).count();

		System.out.println(count);
	}

}

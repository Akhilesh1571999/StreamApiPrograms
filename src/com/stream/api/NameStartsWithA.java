package com.stream.api;

import java.util.Arrays;
import java.util.List;

public class NameStartsWithA {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Aniket","Anil","Suyesh","Kunal","rakesh");
		
		names.stream().filter(s->s.startsWith("A")).forEach(System.out::println);
		

	}

}

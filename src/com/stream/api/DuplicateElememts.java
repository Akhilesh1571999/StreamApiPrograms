package com.stream.api;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElememts {

	public static void main(String[] args) {

		List<Integer> list= Arrays.asList(10,20,25,25,60,87,87,99,99);
		Set<Integer> set =new HashSet<Integer>();
		
		list.stream().filter(n->!set.add(n))
		.forEach(System.out::println);
	
	}

}

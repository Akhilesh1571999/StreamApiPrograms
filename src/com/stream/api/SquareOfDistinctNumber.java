package com.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOfDistinctNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3,9,8,2,7);
		
		List<Integer> collect = list.stream().map(n->n*n).distinct()
				.collect(Collectors.toList());
		
		System.out.println(collect);
		
	}

}

package com.stream.api;

import java.util.Arrays;
import java.util.List;

public class NameSearch {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Aniket","Anil","Suyesh","Kunal","rakesh");
		
		String nameTofind ="Suyesh";
		
		boolean anyMatch = names.stream().anyMatch(n->n.equals(nameTofind));
		
		
		if(anyMatch) {
			System.out.println("Name is present");
		}else {
			System.out.println("Name is not present");

		}
		
	}
	

}

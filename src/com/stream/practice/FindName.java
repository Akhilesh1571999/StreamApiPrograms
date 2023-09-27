package com.stream.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindName {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Aniket","Akhilesh","Sahil","Rakesh","Kunal");
		
		String findName= "Anil";
		 boolean anyMatch = names.stream().anyMatch(n->n.equals(findName));
		
	 if(anyMatch){
			 System.out.println("Name is there in list");
	}else {
		System.out.println("Name is not there in list");

		
	}
}

}

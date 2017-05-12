package com.shankar.java8.streammap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * @author shankar
 * Multiply given number list
 */
public class MultiplyNumberInList {

	
	public static void main(String[] args) {
		
		/**
		 * Multiply given number list
		 */
		int multiple = 3;
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		System.out.println("original list");
		numbers.forEach(System.out:: println);
		System.out.println("=======================================================================");
		List<Integer> doubledNumbers = numbers.stream()
									   .map(num-> num *multiple)
									   .collect(Collectors.toList());
		
		
		System.out.println("Multiply given number list by 3");
		System.out.println("=======================================================================");
		doubledNumbers.forEach(System.out:: println);
		
		
		
	}
	
}

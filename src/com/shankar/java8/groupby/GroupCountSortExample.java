package com.shankar.java8.groupby;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupCountSortExample {
	
	public static void main(String[] args) {
		
		/**
		 * Simple list of fruits  
		 */
		
		List<String> items =
	                Arrays.asList("apple", "apple", "banana",
	                        "apple", "orange", "banana", "papaya");

		 
		/**
		 * group by , count and store it in map 
		 */
		 
		Map<String, Long> result = items.stream()
									.collect(
											Collectors.groupingBy(
													Function.identity(), Collectors.counting()
													)
											);
		
		System.out.println(result);
									
		/**
		 * Sort map and store it in another map							
		 */
		
		Map<String, Long> finalResult= new LinkedHashMap<>();
		
				
		result.entrySet().stream()
						.sorted(Map.Entry.<String, Long>comparingByValue()
								.reversed()).forEachOrdered(e-> finalResult.put(e.getKey(), e.getValue()));
		
		
		System.out.println(finalResult);
	}

}

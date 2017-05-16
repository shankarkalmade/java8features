package com.shankar.java8.groupby;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.shankar.java8.main.Item;
import com.shankar.java8.util.ItemGenerator;

public class GroupCountExample {

	public static void main(String[] args) {
		
		List<Item> itemList = ItemGenerator.getItemList();
		
		/**
		 * get item and count map
		 */
		
		Map<String, Long> countMap = itemList.stream()
								.collect(
										
										Collectors.groupingBy(Item::getName, Collectors.counting()) 
												
										);
								
		System.out.println("Count map");
		System.out.println(countMap);
		
		
		/**
		 * Create qty map for each item
		 */
		
		Map<String, Integer> qtyMap = itemList.stream().collect(
					Collectors.groupingBy(Item :: getName, Collectors.summingInt(Item :: getQty))
				
				);
				
		System.out.println("Quantity Map");
		System.out.println(qtyMap);
		
		/**
		 * grouping items by cost						
		 */
		
		
		Map<BigDecimal, List<Item>> costMap = itemList.stream().collect(
							
					Collectors.groupingBy(Item :: getPrice)
				);
		
		System.out.println("Cost Map ");
		System.out.println(costMap);
		
		Map<BigDecimal, Set<String>> costMap2 = itemList.stream().collect(
				
				Collectors.groupingBy(Item :: getPrice, Collectors.mapping(Item :: getName, Collectors.toSet())
						)
			);
		
		System.out.println("Cost Map ");
		System.out.println(costMap2);
	}
	
	
}

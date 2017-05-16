package com.shankar.java8.util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.shankar.java8.main.Developer;
import com.shankar.java8.main.Item;

public class ItemGenerator {
	
	private static List<Item> itemList =  new ArrayList<Item>();
	
	
	static {
		itemList = Arrays.asList(
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 20, new BigDecimal("19.99")),
                new Item("orang", 10, new BigDecimal("29.99")),
                new Item("watermelon", 10, new BigDecimal("29.99")),
                new Item("papaya", 20, new BigDecimal("9.99")),
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 10, new BigDecimal("19.99")),
                new Item("apple", 20, new BigDecimal("9.99"))
        );

		
	}
	
	public static List<Item> getItemList () {
		return itemList;
	}

}

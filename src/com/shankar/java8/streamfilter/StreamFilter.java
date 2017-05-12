package com.shankar.java8.streamfilter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.shankar.java8.main.Developer;
import com.shankar.java8.util.DeveloperDisplayManager;
import com.shankar.java8.util.DeveloperGenerator;

public class StreamFilter {

	
	public static void main(String[] args) {
		
		List<Developer> devList = DeveloperGenerator.getDeveloper();
		
		/**
		 * Listing all Dev Above 30
		 */
		
		List<Developer> filteredList = new ArrayList<>();

		filteredList = getAgeMoreThan(30, devList);
		System.out.println("Filtering Dev above 30 using simple filter and collect");
		System.out.println("=======================================================================");
		for(Developer dev :  filteredList) {
			DeveloperDisplayManager.displayDeveloper(dev);
		}
		System.out.println("=======================================================================");
		
		
		/**
		 * Get users by name: mkyong or else return nill
		 */
		System.out.println("Get users by name: mkyong");
		filteredList = getByName("mkyong", devList);
		System.out.println("=======================================================================");
		for(Developer dev :  filteredList) {
			DeveloperDisplayManager.displayDeveloper(dev);
		}
		System.out.println("=======================================================================");


		/**
		 * Get users by name: shankar or else return nill
		 */
		System.out.println("Get users by name: shankar");
		filteredList = getByNameElseNull("shankar", devList);
		if(filteredList!=null) {
		System.out.println("=======================================================================");
		for(Developer dev :  filteredList) {
			DeveloperDisplayManager.displayDeveloper(dev);
		}
		} else {
			System.out.println("Filtered list is null");
		}
		System.out.println("=======================================================================");

		
		/**
		 * Get users by age more than 30 and name contains "m"
		 */
		System.out.println("Get users by age more than 30 and name contains: m");
		filteredList = getAgeMoreThanContains(30, "m", devList);
		System.out.println("=======================================================================");
		for(Developer dev :  filteredList) {
			DeveloperDisplayManager.displayDeveloper(dev);
		}
		System.out.println("=======================================================================");

		
		/**
		 * Get users names using stream, map and  collect
		 */
		System.out.println("Get users names");
		List<String> names= getDeveloperNames(devList);
		System.out.println("=======================================================================");
		for(String name :  names) {
			System.out.println(name);
		}
		System.out.println("=======================================================================");
	}
	
	private static List<Developer> getAgeMoreThan (int age, List<Developer> devList) {
		List<Developer>  filteredList = devList.stream()
												.filter(dev-> dev.getAge()> age)
												.collect(Collectors.toList());
		
		return filteredList;
	}
	
	private static List<Developer> getByName (String name, List<Developer> devList) {
		List<Developer>  filteredList = devList.stream()
												.filter(dev-> dev.getName().equals(name))
												.collect(Collectors.toList());
		
		return filteredList;
	}
	
	private static List<Developer> getByNameElseNull (String name, List<Developer> devList) {
		List<Developer>  filteredList = (List<Developer>) devList.stream()
												.filter(dev-> dev.getName().equals(name))
												.findAny()
												.orElse(null);
		
		return filteredList;
	}
	
	private static List<Developer> getAgeMoreThanContains (int age, String name, List<Developer> devList) {
		List<Developer>  filteredList = devList.stream()
												.filter(dev-> dev.getAge()> age && dev.getName().contains(name))
												.collect(Collectors.toList());
		
		return filteredList;
	}

	private static List<String> getDeveloperNames (List<Developer> devList) {
		List<String> filteredList = devList.stream()
												.map(Developer:: getName)
												.collect(Collectors.toList());
		
		return filteredList;
	}
	
}

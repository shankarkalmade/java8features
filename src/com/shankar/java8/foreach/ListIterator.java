package com.shankar.java8.foreach;

import java.util.List;
import java.util.Map;

import com.shankar.java8.main.Developer;
import com.shankar.java8.util.DeveloperDisplayManager;
import com.shankar.java8.util.DeveloperGenerator;
/**
 * 
 * @author shankar
 * java 8 way of iterating List
 */
public class ListIterator {

	
	public static void main(String[] args) {
		
		List<Developer> devList = DeveloperGenerator.getDeveloper();
				
		System.out.println("Iterate map using classic map Entry");
		System.out.println("=======================================================================");
		
		/**
		 * First way
		 */
		devList.forEach(dev-> DeveloperDisplayManager.displayDeveloper(dev));
		System.out.println("=======================================================================");
		
		/**
		 * Accessing internal functions
		 */
		
//		devList.forEach(dev-> {
//			System.out.println(dev.getName());;
//		});
		
		/**
		 * Stream and filter with age more than 30
		 */
		System.out.println("=======================================================================");
		System.out.println("Stream and filter with age more than 30");
		devList.stream()
				.filter(dev-> dev.getAge()>30)
				.forEach(dev-> DeveloperDisplayManager.displayDeveloper(dev));
		System.out.println("=======================================================================");
	}
}

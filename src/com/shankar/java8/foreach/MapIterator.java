package com.shankar.java8.foreach;

import java.util.Map;

import com.shankar.java8.main.Developer;
import com.shankar.java8.util.DeveloperDisplayManager;
import com.shankar.java8.util.DeveloperGenerator;
/**
 * 
 * @author shankar
 *	Iterating map using foreach
 */
public class MapIterator {


	public static void main(String[] args) {
		
		Map<Integer, Developer> devMap = DeveloperGenerator.getDeveloperMap();
		
		System.out.println("Iterate map using classic map Entry");
		System.out.println("=======================================================================");
		devMap.forEach((key,value)-> {
			System.out.print("ID: "+ key+"     ");
			DeveloperDisplayManager.displayDeveloper(value);
		});
		
		
		System.out.println("=======================================================================");
	}
	
	
	
}

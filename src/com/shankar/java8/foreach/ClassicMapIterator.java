package com.shankar.java8.foreach;

import java.util.Map;

import com.shankar.java8.main.Developer;
import com.shankar.java8.util.DeveloperDisplayManager;
import com.shankar.java8.util.DeveloperGenerator;

import sun.awt.DisplayChangedListener;

/**
 * 
 * @author shankar
 * Iterate map using classic map Entry	
 */

public class ClassicMapIterator {


	public static void main(String[] args) {
		
		Map<Integer, Developer> devMap = DeveloperGenerator.getDeveloperMap();
		
		System.out.println("Iterate map using classic map Entry");
		System.out.println("=======================================================================");
		for(Map.Entry<Integer, Developer> dev : devMap.entrySet()) {
			
			System.out.print("ID: "+ dev.getKey()+"     ");
			DeveloperDisplayManager.displayDeveloper(dev.getValue());
			
		}
		
		System.out.println("=======================================================================");
	}
	
	
	
}

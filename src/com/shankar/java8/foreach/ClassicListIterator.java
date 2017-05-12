package com.shankar.java8.foreach;

import java.util.List;

import com.shankar.java8.main.Developer;
import com.shankar.java8.util.DeveloperDisplayManager;
import com.shankar.java8.util.DeveloperGenerator;
/**
 * 
 * @author shankar
 * List iterator using for classic example
 */
public class ClassicListIterator {

	public static void main(String[] args) {
		
		List<Developer> devList = DeveloperGenerator.getDeveloper();
		
		System.out.println("Iterate list using for");
		System.out.println("=======================================================================");
		for(Developer dev :  devList) {
			DeveloperDisplayManager.displayDeveloper(dev);
		}
		System.out.println("=======================================================================");
		
	}
	
	
}

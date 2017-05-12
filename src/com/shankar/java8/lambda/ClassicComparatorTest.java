package com.shankar.java8.lambda;

import java.util.Collections;
import java.util.List;

import com.shankar.java8.main.Developer;
import com.shankar.java8.util.DeveloperDisplayManager;
import com.shankar.java8.util.DeveloperGenerator;
/**
 * 
 * 
 * @author shankar
 *	using classic comparator we need to change function each time with arg passed or create new one specific for that
 */
public class ClassicComparatorTest {

	
public static DeveloperDisplayManager displayManager = new DeveloperDisplayManager();
	
	public static void main(String arg[]) {
		
		
		System.out.println("Started");
		List<Developer> devList= DeveloperGenerator.getDeveloper();
		displayManager.displayDeveloperList(devList);
		ClaassicComparator comparator = new ClaassicComparator();
		/**
		 * Sort by Age
		 */
		Collections.sort(devList, comparator.sortByAge);
		System.out.println("Sort By age");
		displayManager.displayDeveloperList(devList);
		
		
		/**
		 * Sort by Name
		 */
		System.out.println("Sort by Name");
		Collections.sort(devList, comparator.sortByName);
		displayManager.displayDeveloperList(devList);
		
		
	} 
	
}

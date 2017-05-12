package com.shankar.java8.lambda;

import java.util.Collections;
import java.util.List;

import com.shankar.java8.main.Developer;
import com.shankar.java8.util.DeveloperDisplayManager;
import com.shankar.java8.util.DeveloperGenerator;

/**
 * 
 * @author shankar
 *	Using lambda and in build java list sort method
 */
public class LambdaComparator {
	
	public static DeveloperDisplayManager displayManager = new DeveloperDisplayManager();
	
	public static void main(String arg[]) {
		
		System.out.println("Started");
		List<Developer> devList= DeveloperGenerator.getDeveloper();
		displayManager.displayDeveloperList(devList);
		
		/**
		 * Sort by Age
		 */
		System.out.println("Sort By age");
		devList.sort((o1, o2) -> o1.getAge() - o2.getAge());
		displayManager.displayDeveloperList(devList);
		
		/**
		 * Sort by Name
		 */
		System.out.println("Sort by Name");
		devList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
		displayManager.displayDeveloperList(devList);
		
		/**
		 * Sort by Salary
		 */
		System.out.println("Sort by Salary");
		devList.sort((o1, o2) -> o1.getSalary().compareTo(o2.getSalary()));
		displayManager.displayDeveloperList(devList);

		/**
		 * Sort by Salary reverse
		 */
		System.out.println("Sort by Salary Desc");
		devList.sort((o1, o2) -> o2.getSalary().compareTo(o1.getSalary()));
		displayManager.displayDeveloperList(devList);
		
	} 
	


}

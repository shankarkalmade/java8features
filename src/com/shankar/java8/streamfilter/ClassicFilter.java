package com.shankar.java8.streamfilter;

import java.util.ArrayList;
import java.util.List;

import com.shankar.java8.main.Developer;
import com.shankar.java8.util.DeveloperDisplayManager;
import com.shankar.java8.util.DeveloperGenerator;
import com.sun.org.apache.xerces.internal.impl.dv.DVFactoryException;

public class ClassicFilter {
	
	public static void main(String[] args) {
		
		List<Developer> devList = DeveloperGenerator.getDeveloper();
		
		/**
		 * Filtering Dev above 30"
		 */
		List<Developer> filterDevList=getAgeMorethan(30, devList); 
		System.out.println("Filtering Dev above 30");
		System.out.println("=======================================================================");
		for(Developer dev :  filterDevList) {
			DeveloperDisplayManager.displayDeveloper(dev);
		}
		System.out.println("=======================================================================");
		
		/**
		 * Get users by name: mkyong
		 */
		System.out.println("Get users by name: mkyong");
		filterDevList = getbyName("mkyong", devList);
		System.out.println("=======================================================================");
		for(Developer dev :  filterDevList) {
			DeveloperDisplayManager.displayDeveloper(dev);
		}
		System.out.println("=======================================================================");
		
		
	}
	
	private static List<Developer> getAgeMorethan (int age, List<Developer> devList) {
		List<Developer> filteredList = new ArrayList<>();
		for(Developer dev: devList) {
			if(dev.getAge()> age){
				filteredList.add(dev);
			}
		}
		return filteredList;
	}
	
	private static List<Developer> getbyName (String name, List<Developer> devList) {
		List<Developer> filteredList = new ArrayList<>();
		for(Developer dev: devList) {
			if(dev.getName().equals(name)){
				filteredList.add(dev);
			}
		}
		return filteredList;
	}


}

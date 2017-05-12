package com.shankar.java8.streamfilter;

import java.util.List;
import java.util.stream.Collectors;

import com.shankar.java8.main.Developer;
import com.shankar.java8.util.DeveloperDisplayManager;
import com.shankar.java8.util.DeveloperGenerator;

public class NameListFromObjectList {

	
	public static void main(String[] args) {
		
		List<Developer> devList = DeveloperGenerator.getDeveloper();
		
		DeveloperDisplayManager displayManager = new DeveloperDisplayManager();
		displayManager.displayDeveloperList(devList);
		
		
		/**
		 * Generate name list from list of objects
		 * 
		 */
		
		List<String> names = getNameList(devList);
		
		names.forEach(System.out:: println);
		
		
		
		
	}
	
	private static List<String> getNameList(List<Developer> devList) {
		
		List<String> nameList = devList.stream()
								.map(Developer:: getName)
								.collect(Collectors.toList());
		return nameList;
		
	}
	
}

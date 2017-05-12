package com.shankar.java8.util;

import java.util.List;

import com.shankar.java8.main.Developer;

public class DeveloperDisplayManager {
	
	public void displayDeveloperList ( List<Developer> devList) {
		
		System.out.println("=======================================================================");
		for(Developer dev : devList) {
			System.out.println(rightPadding(dev.getName(), 20) + "         "+ rightPadding(dev.getAge()+"", 3)+  "         "+ rightPadding(dev.getSalary()+"", 8));
		}
		System.out.println("=======================================================================");
	}

	public static String rightPadding(String str, int num) {
	    return String.format("%1$-" + num + "s", str);
	}
}

package com.shankar.java8.lambda;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.shankar.java8.main.Developer;

public class DeveloperGenerator {
	
	private static List<Developer> devList =  new ArrayList<Developer>();
	
	static {
		devList.add(new Developer("mkyong", new BigDecimal("70000"), 33));
		devList.add(new Developer("alvin", new BigDecimal("80000"), 20));
		devList.add(new Developer("jason", new BigDecimal("100000"), 10));
		devList.add(new Developer("iris", new BigDecimal("170000"), 55));
	}

	public static List<Developer> getDeveloper () {
		return devList;
	}
	
}



package com.shankar.java8.util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.shankar.java8.main.Developer;

public class DeveloperGenerator {
	
	private static List<Developer> devList =  new ArrayList<Developer>();
	private static Map<Integer,Developer> devMap =  new HashMap<Integer, Developer>();

	static {
		devList.add(new Developer("mkyong", new BigDecimal("70000"), 33));
		devList.add(new Developer("alvin", new BigDecimal("80000"), 20));
		devList.add(new Developer("jason", new BigDecimal("100000"), 10));
		devList.add(new Developer("iris", new BigDecimal("170000"), 55));
	}

	static {
		devMap.put(1,new Developer("mkyong", new BigDecimal("70000"), 33));
		devMap.put(2,new Developer("alvin", new BigDecimal("80000"), 20));
		devMap.put(3,new Developer("jason", new BigDecimal("100000"), 10));
		devMap.put(4,new Developer("iris", new BigDecimal("170000"), 55));
	}

	
	public static List<Developer> getDeveloper () {
		return devList;
	}
	
	public static Map<Integer, Developer> getDeveloperMap () {
		return devMap;
	}
	
	
}



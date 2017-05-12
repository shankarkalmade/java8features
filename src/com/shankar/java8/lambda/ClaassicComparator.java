package com.shankar.java8.lambda;

import java.util.Comparator;

import com.shankar.java8.main.Developer;

public class ClaassicComparator {

	Comparator<Developer> sortByAge = new Comparator<Developer>() {

		@Override
		public int compare(Developer o1, Developer o2) {
			
			return o1.getAge() - o2.getAge();
		}
		
	};
		
	Comparator<Developer> sortByName = new Comparator<Developer>() {

		@Override
		public int compare(Developer o1, Developer o2) {
			
			return o1.getName().compareTo(o2.getName());
		}
		
	};
	
}

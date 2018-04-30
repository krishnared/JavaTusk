package com.MultiThreading;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicateValuesInArrayList {
	public static void main(String[] args) {
		
		ArrayList<String> names=new ArrayList<>();
		names.add("Mangesh");
		names.add("Suresh");
		names.add("Naresh");
		names.add("Mangesh");
		Set<String> n=new HashSet<>();
		
		for(String name:names)
		{
			if(n.add(name)==false)
			System.out.println(name);
		}

	}
}

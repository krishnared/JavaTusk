package com.MultiThreading;

import java.util.HashMap; 
import java.util.Map;
import java.util.Set;

public class MapInterface {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("myName", "Navin");
		map.put("actor", "Sharukh");
		map.put("game", "COD");
		map.put("actor", "Navin");
		Set<String> keys = map.keySet();

		for (String key : keys) {
			System.out.println(key + " " + map.get(key));
		}
	}
}
/*
 * Advantages : 1)The old value will be replaced with the new value 2)
 */
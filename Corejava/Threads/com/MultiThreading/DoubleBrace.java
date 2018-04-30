package com.MultiThreading;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class DoubleBrace {
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(56, 432, 233);
		values.forEach(System.out::println);
		List<Integer> value = new ArrayList<Integer>() {
			{
				add(21);
				add(88);
			}
		};
		value.forEach(System.out::println);
	}
}

package com.MultiThreading;

public class TimeTakenForExecution {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int i = 1;
		int j = 1;
		for (int k = 1; k < 100012; k++) {
			System.out.println(i + j);
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		
		long value=System.currentTimeMillis();
		System.out.println(value); //Millis from jan 1st 1970;
		 
	}
}
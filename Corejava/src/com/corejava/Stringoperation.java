package com.corejava;

//Write a program to accept two strings from user and perfom operations
/*1) Find out length of both the strings
  2) Concatination of two strings
  3) Convert first string into uppercase */

public class Stringoperation {
	static String L = "lafde";
	static String M = "Zindagi";
	static int i = 3;

	public static void main(String[] args) {
		length();
	}

	public static void length() {
		Stringoperation obj = new Stringoperation();
		System.out.println( obj.L    +  "Result on concatenation is :" + obj.M);
		System.out.println(L.length());
		System.out.println(L.toUpperCase() + M.toLowerCase());
		System.out.println(L.hashCode());
		System.out.println(L.getBytes());
		System.out.println(i);

	}

}

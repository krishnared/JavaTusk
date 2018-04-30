package com.corejava;

public class Staticblock {
	 public static void main(String[] args)
	 {
	 System.out.println("Ramarao"); 
	 }
	 //	static method loads into jvm before main method loads into jvm
	 // static methods before the main method loading
	static
	{
		System.out.println("Hello world");
	}
		
	static
	{
		System.out.println("bye world ");
	}

}

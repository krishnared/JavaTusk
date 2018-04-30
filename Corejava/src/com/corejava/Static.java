package com.corejava;

public class Static 
{
public static void main(String args[])
{
	
test.show();
}
}

class test //A class can never be static
{
	static int i; // Can be accessed globally in the program
	public static void main()
	{
		System.out.println("Beautiful world");
	}
	public static void show()
	{
		System.out.println("Hello world");
	}
	}
	




/*The static keyword in java is used for memory management mainly. We can apply java static keyword with variables, methods, blocks and nested class. The static keyword belongs to the class than instance of the class.

The static can be:

variable (also known as class variable)
method (also known as class method)
block
nested class*/
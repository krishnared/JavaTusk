package com.corejava;

public class ReferenceTest {
public static void main(String[] args)
{
RefTesting r1 = new RefTesting();
r1.show();
}
}

class RefTesting
{
	public RefTesting()
	{
		System.out.println("Default Constructor");
	}
	public void show()
	{
		System.out.println("Hello World");		
	}
}
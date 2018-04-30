package com.corejava;

public class Constructor 
{
public static void main(String[] args)
{
Abc cobj= new Abc(5,2.4); //When the object is created only, constructor will call the Abc Default constructor

//Here cobj is the reference
//Constructor() is the constructor

}
}

class Abc
{
	public Abc() // Default Constructor
	//public static void main(String[] args)
	{
	System.out.println("Hello");
	}
	public Abc(int i) //Overloaded Constructor -> Constructor overloading
	 // Same name with different parameters is called constructor overloading.
	{
		System.out.println("Life is a race"+i);
	}
	public Abc(int i,double d) 
		{
			System.out.println("Zindagi na milege dobara");
		}
	
	}

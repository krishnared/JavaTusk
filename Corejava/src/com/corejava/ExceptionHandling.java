package com.corejava;

public class ExceptionHandling {
	public static void main(String[] args)
	{
	int i,j;
	double k=0;
	i=3;
	j=0;
	try
	{
		k=i/j; //Unchecked exceptions
	}
	catch(Exception e)
	{
		System.out.println("Cannot divide by zero");
	}
	System.out.println(k);
} }
	

/* Throwable extends 
	         Exception Class
	         - Checked 
	              IO Exception
	              Sql Exception
	         - Unchecked
	              Runtime Exception 
	                -Array out of bound
	                - File not found exception
	                - Many
	                    */



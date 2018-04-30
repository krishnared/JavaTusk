package com.corejava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CheckedExecption {
	public static void main(String[] args)
	{
	int i = 0,j = 0,k;
	//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	Scanner sc=new Scanner(System.in);
	try	
	{
		System.out.println("Enter I value");
		i=sc.nextInt();
		System.out.println("Enter J value");
		j=sc.nextInt();
		k=i/j;
		System.out.println(k);
	}
	catch(ArithmeticException e)
	{
		System.out.println("Cannot divide by zero");
	}
	catch(Exception e)
	{
		System.out.println("Unknown Exception");
	}
	finally
	{
        sc.close();
		System.out.println("Thank you");
		
		
	}
	
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



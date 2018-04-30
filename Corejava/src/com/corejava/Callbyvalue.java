package com.corejava;
public class Callbyvalue
{
	
	public static void main(String args[])
	{
		int sum = Add(2,3);
		System.out.println(sum);
		//
		double subsum = Substract(2,3.5);
		System.out.println(subsum);
		//
		tryreturn(2,3); 

		// This will go to the tryreturn method with parameters
		// And execute the println function.
	}
	
	public static int Add(int a,int b)
	{
	return(a+b);
	//Resource : Parameter passing and returning a value from a method (Programming knowledge)
	}
	
	public static double Substract(int i,double k)
	{
		//System.out.println(i+k);
		return(i+k); 
	}
	
    //the return type (or result type) defines and constrains the data type of the value returned from a subroutine or method.
	
	public static void tryreturn(int l,int m)
	{
	System.out.println(l+m);
	}
	}
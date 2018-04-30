package com.corejava;

public class MarkerInterface {
public static void main(String[] args)
{
	Demo obj=new Demo();
	if(obj instanceof Security)
	{
		obj.show();
		System.out.println("You have permission to access");
	}
	else
	{
		System.out.println("You are denied");
	}
}
}

class Demo implements Security
{
	void show()
	{
		System.out.println("Hello world ");
	}
}
interface Security
{
	
}
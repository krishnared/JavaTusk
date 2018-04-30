package com.corejava;

public class AnonymousObject {

	public static void main(String[] args) 
	{
		new A().show();
		new A().i=5;
		System.out.println(new A().i);
	}
	
	}
class A
{
	int i;
	int j;
	
	public void show()
	{ 
		
		System.out.println("What the Hell");
	}
	}



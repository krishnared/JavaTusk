package com.corejava;

import com.corejava.Visa.Immigration;

public class Inheritance {

	public static void main(String[] args)
	{
		Passport obj=new Passport();
		obj.Show();
		Visa.Ran();
		Visa r2=new Visa();
		Immigration.struck();
		
	}
}

  class  Passport
{
	static String Name ="Krishnareddy";
	 int id=121;
	 int iid=321;
	public Passport()
	{
		//Super Keyword
		System.out.println(id);
	}
	
	public  void Show()
	{
		System.out.println(Name +iid);
		
	}
}
  class Visa extends Passport
  {
	 int a=3;
     int c=a*iid;
	
	public static void Ran()
	{
		Visa obj=new Visa();
	System.out.println(obj.c);
	}
static class Immigration extends Visa
{
	static int j;
	static int l;
	public static void struck()
	{
		
		int d=l*j;
		System.out.println(d);
	}
	}
}
  
  


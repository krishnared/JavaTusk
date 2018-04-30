package com.corejava;

public class StringImmutable {
public static void main(String[] args)
{
	String str="krishna";	
	String str1="krishna";
	String mystring=new String("Value");
	String mystring1=new String("Value");
	String mystring2=new String("value");
	
	
	//Usually String is immutable in nature
	StringBuffer str3=new StringBuffer("Testing SB");
	StringBuffer str4=new StringBuffer("Testing 00SB");
	  
	System.out.println(mystring.hashCode());
	System.out.println(mystring1.hashCode());
	System.out.println("The value of mystring2 is : " +mystring2.hashCode());
	System.out.println(str3.hashCode());
	System.out.println(str4.hashCode());
	System.out.println(str);
	System.out.println(str1);
}
}

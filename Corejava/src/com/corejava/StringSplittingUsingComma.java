package com.corejava;

public class StringSplittingUsingComma {
public static void main(String[] args)
{
	String str="Alex, John, Royal";
	String names[]=str.split(",");
	System.out.println(names[2]);
}
}

package com.corejava;

public class Accessmodifiers
{
	// Only Public,Abstract and final are accepted( ILLEGAL MODIFIER ERROR)
	// The reason why class should be public is because the class 
	// should be available for JVM to execute.
	/* 
	  -ACCESS MODIFIERS 
	  Private,Default,Protected,Public 
	  -NON ACCESS MODIFIERS
	  Static,Abstract,Synchronized,Native,Volatile,Transient etc.
	 */
public void main(String args[])
//private - The main method is never used locally, so private is not allowed
//
{
    int a[]= {1,2,3,4,5};
	System.out.println(a[0]);
}
}

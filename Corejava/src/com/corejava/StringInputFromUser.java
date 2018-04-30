package com.corejava;

import java.util.Scanner;

public class StringInputFromUser {

	public static void main(String[] args) {
String s1,s2;
int a1,a2;
Scanner sc=new Scanner(System.in);
System.out.println("Enter two srings");
s1=sc.nextLine();
s2=sc.nextLine();
System.out.println("Enter two Numbers");
a1=sc.nextInt();
a2=sc.nextInt();
String s3=s1.concat(s2);
System.out.println(a1+a2);
System.out.println(s3);
	}

}

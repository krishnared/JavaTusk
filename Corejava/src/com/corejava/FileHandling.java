package com.corejava;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) throws Exception {
// For creating file and inserting text
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the file name");
		File f=new File(sc.nextLine());
		FileOutputStream fos = new FileOutputStream(f);
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeUTF("Hi, How are you doing ?");
//For Printing
		FileInputStream fis=new FileInputStream(f);
		DataInputStream dis=new DataInputStream(fis);
		String str=dis.readUTF(dis);
	
		
	}

}

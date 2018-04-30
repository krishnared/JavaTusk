package com.corejava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesFile {
public static void main(String[] args) throws Exception
{
	Properties p=new Properties();
	FileOutputStream fos=new FileOutputStream("dataconfig.properties");
	p.setProperty("Url", "192.245.222.50");
	p.setProperty("Username","Krishna");
	p.setProperty("Password", "1234");
p.store(fos, "properties");
System.out.println("Successfully updated details");

String str=p.getProperty("Url");
System.out.println("The Url is " +str);
p.list(System.out);

}
}

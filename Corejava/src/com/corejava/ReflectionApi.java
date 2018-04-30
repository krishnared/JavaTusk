package com.corejava;

import java.lang.reflect.Method;

public class ReflectionApi {
public static void Main() throws Exception
{
	Class c=Class.forName("package com.corejava.Reflection");
	Reflection obj=(Reflection)c.newInstance(); 
	
	Method m=c.getDeclaredMethod("api", null);
	m.setAccessible(true);
    m.invoke(obj,null);
}
}

class Reflection
{
	private void api()
{
	System.out.println("Hello world");
}
}
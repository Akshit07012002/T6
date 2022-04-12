package trimester6;

import java.io.*;

class OverloadDemo
{
	void test()
	{
		System.out.println(" No parameters");
	}
	void test(int a)
	{
		System.out.println(" a : " + a);
	}
	
	void test(int a, int b)
	{
		System.out.println(" a : "+ a + "\n b : " + b);
	}
	
	double test(double a)
	{
		System.out.println(" double a : " + a);
		return a*a;
	}
}

public class MethodOverloading
{
	public static void main(String []args)throws IOException
	{
		OverloadDemo ob = new OverloadDemo();
		double result; 
		ob.test();
		ob.test(10);
		ob.test(10,20);
		result = ob.test(123.2);
		
		System.out.println(" Result of (123.2)^2 = " + result);
	}
}

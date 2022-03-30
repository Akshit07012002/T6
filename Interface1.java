package trimester6;

import java.io.*;

interface Shape
{
	public void dimensions();
	public void area();
}

class Rect implements Shape
{
	int l = 0, b = 0;
	public void dimensions()
	{
		l = 10; b = 20;
	}
	public void area()
	{
		System.out.println(l*b);
	}
}

public class Interface1 
{
	public static void main(String []args)throws IOException
	{
		Rect r = new Rect();
		r.dimensions();
		r.area();
	}
}
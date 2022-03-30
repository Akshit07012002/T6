package trimester6;

import java.io.*;

abstract class Graphic
{
	double l, b, r;
	
	Graphic()
	{
		l = b = r = 0d;
	}
	
	abstract double area();
}

class Circle extends Graphic
{
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	double area()
	{
		return (3.14*r*r);
	}
	void getRadius()throws IOException
	{
		System.out.print(" Enter the radius : ");
		r = Double.parseDouble(in.readLine());
	}
}

class Rectangle extends Graphic
{
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	double area()
	{
		return (l*b);
	}
	void getDimensions()throws IOException
	{
		System.out.print(" Enter the length : ");
		l = Double.parseDouble(in.readLine());
		System.out.print(" Enter the breadth : ");
		b = Double.parseDouble(in.readLine());
	}
}

public class Abstraction1 
{
	public static void main(String []args)throws IOException
	{
		double a;
		
		Rectangle r = new Rectangle();
		System.out.println(" Rectangle ");
		r.getDimensions();
		a = r.area();
		System.out.println(" Area : " + a);
		
		Circle c = new Circle();
		System.out.println("----------------------------\n Circle ");
		c.getRadius();
		a = c.area();
		System.out.println(" Area : " + a);
	}
}
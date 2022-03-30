package trimester6;

import java.io.*;

interface Polygon
{
	double getArea();
	
	default void getSides()
	{
		System.out.println("I can get sides of a polygon");
	}
}

class Rect2 implements Polygon
{
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	double l, b, area;
	
	public void getDimensions()throws IOException
	{
		System.out.print(" Enter the length : ");
		l = Double.parseDouble(in.readLine());
		System.out.print(" Enter the breadth : ");
		b = Double.parseDouble(in.readLine());
	}
	public double getArea()
	{
		return(l*b);
	}
}

class Square implements Polygon
{
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	double s, area;
	
	public void getDimensions()throws IOException
	{
		System.out.print(" Enter side : ");
		s = Double.parseDouble(in.readLine());
	}
	public double getArea()
	{
		return(s*s);
	}
}

public class Interfaces3
{
	public static void main(String []args)throws IOException
	{
		double a;
		
		Rect2 r = new Rect2();
		System.out.println(" Rectangle ");
		r.getDimensions();
		a = r.getArea();
		System.out.println(" Area : " + a);
		
		Square s = new Square();
		System.out.println("----------------------------\n Square");
		s.getDimensions();
		a = s.getArea();
		System.out.println(" Area : " + a);
	
	}
}
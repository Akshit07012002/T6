package trimester6;

import java.io.*;

class Shapes
{
	int side;
	double length, breadth, height, radius, area;
	final double pi = 3.141592;
	
	Shapes()
	{
		side = 0;
		length = breadth = height = radius = area = 0.0d;
	}
	
	//square
	Shapes(int s)
	{
		side = s;
	}
	
	//circle
	Shapes(double r)
	{
		radius = r;
	}
	
	//triangle
	Shapes(int h, int b)
	{
		height = h; breadth = b;
	}
	
	//rectangle
	Shapes(double l, double b)
	{
		length = l; breadth = b;
	}
	
	double area(int s)
	{
		return (s*s);
	}
	
	double area(double radius)
	{
		return (pi*radius*radius);
	}
	
	double area(double length, double breadth)
	{
		return (length*breadth);
	}
	
	double area(int breadth, int height)
	{
		return (0.5*breadth*height);
	}
}

public class AssignmentMethodOverloading 
{
	public static void main(String[] args) throws IOException
	{
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int s = 0, tb = 0, th = 0;
		double l = 0.0d, b = 0.0d, h = 0.0d, r = 0.0d;
		//square
		System.out.print(" Enter side measure for square : ");
		s = Integer.parseInt(in.readLine());
		Shapes square = new Shapes(s);
		System.out.println(" Area of Square : " + square.area(s)+ "\n-----------------------------s");
		
		//circle
		System.out.print(" Enter radius measure for circle : ");
		r = Double.parseDouble(in.readLine());
		Shapes circle = new Shapes(r);
		System.out.println(" Area of Circle : " + circle.area(r)+ "\n-----------------------------");
		
		//triangle
		System.out.print(" Enter base measure for triangle : ");
		tb = Integer.parseInt(in.readLine());
		System.out.print(" Enter height measure for triangle : ");
		th = Integer.parseInt(in.readLine());
		Shapes triangle = new Shapes(tb, th);
		System.out.println(" Area of Triangle : " + triangle.area(tb,th) + "\n-----------------------------");
		
		//rectangle
		System.out.print(" Enter length measure for rectangle : ");
		l = Double.parseDouble(in.readLine());
		System.out.print(" Enter breadth measure for rectangle : ");
		b = Double.parseDouble(in.readLine());
		Shapes rectangle = new Shapes(l, b);
		System.out.println(" Area of Rectangle : " + rectangle.area(l,b)+ "\n-----------------------------");
		
		
	}
}

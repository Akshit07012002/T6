package trimester6;

import java.io.*;

class Container
{
	double width, height, depth;
	
	Container(double w, double h, double d)
	{
		width = w; height = h; depth = d;
	}
	
	Container()
	{
		width = height = depth = -1;
	}
	
	Container(double len)
	{
		width = height = depth = len;
	}
	
	double volume()
	{
		return(width * height * depth);
	}
	
	boolean equal(Container o)
	{
		if(o.volume() == this.volume())
			return true;
		else
			return false;
	}
}

public class OverloadCons 
{
	public static void main(String []args)throws IOException
	{
		Container c1 = new Container(10,20,15);
		Container c2 = new Container();
		Container cube1 = new Container(7);
		Container cube2 = new Container(7);
		Container cube3 = new Container(8);
		
		double vol = 0.0d;
		
		//getting volume of first box
		vol = c1.volume();
		System.out.println(" Volume of c1 : " + vol);
		
		vol = c2.volume();
		System.out.println(" Volume of c2 : " + vol);
		
		//getting volume of cube
		vol = cube1.volume();
		System.out.println(" Volume of cube 1 : " + vol);
		vol = cube2.volume();
		System.out.println(" Volume of cube 2 : " + vol);
		vol = cube3.volume();
		System.out.println(" Volume of cube 3 : " + vol);
		
		System.out.println( "\n cube1.equal(cube2) : " + (cube1.equal(cube2) ? " Equal " : " Unequal "));
		
		System.out.println( "\n cube2.equal(cube3) : " + (cube2.equal(cube3) ? " Equal " : " Unequal "));
	}
}

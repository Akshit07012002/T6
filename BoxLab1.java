package trimester6;

import java.io.*;

public class BoxLab1
{
	public static void main(String[] args)
	{	
		Box b1 = new Box(10,20,15); 
		Box b2 = new Box(3,6,9);
		Box b3 = new Box(8,9,10);
		
		b1.volume = b1.width * b1.height * b1.depth;
		b2.volume = b2.width * b2.height * b2.depth;
		b3.volume = b3.width * b3.height * b3.depth;
		
		System.out.println(" Volume of Box 1 : " + b1.volume);
		System.out.println(" Volume of Box 2 : " + b2.volume);	
		System.out.println(" Volume of Box 3 : " + b3.volume);
		
		double max = 0.0d;
		max = (Math.max(b1.volume, Math.max(b2.volume, b3.volume)));
		System.out.println("\n Largest Box : " + ((max == b1.volume)?"b1 : ":(max == b2.volume)?"b2 : ":"b3 : ") + max);
		
		double min = 0.0d;
		min = (Math.min(b1.volume, Math.min(b2.volume, b3.volume)));
		System.out.println("\n Smallest Box : " + ((min == b1.volume)?"b1 : ":(min == b2.volume)?"b2 : ":"b3 : ") + min);
	}
}

class Box
{
	double width, height, depth, volume;
	
	Box(){ this(0.0d,0.0d,0.0d); }

	Box(double w, double h, double d) 
	{
		width = w; height = h; depth = d;
	}
		
}
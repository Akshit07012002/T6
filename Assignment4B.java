package trimester6;

import java.io.*;

interface Motorbike
{
	public static final double speed = 10d;
	public double totalDistance(double time);
}

interface Cycle
{
	public static final double distance = 10d;
	public double speed(double time);	
}

class TwoWheeler implements Motorbike, Cycle
{
	public double totalDistance(double time)
	{
		return(speed*time);
	}
	
	public double speed(double time)
	{
		return(distance/time);
	}
}

public class Assignment4B 
{
	public static void main(String []args)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		TwoWheeler tw = new TwoWheeler();
				
		System.out.print("Enter Time taken by Motorcycle (in seconds) : ");
		double t = Double.parseDouble(in.readLine());
		
		System.out.println("Total Distance Covered By Motorcycle : " + tw.totalDistance(t) + " m");
		
		System.out.print("Enter Time taken by Cycle (in seconds) : ");
		t = Double.parseDouble(in.readLine());
		
		System.out.println("Average Speed of Cycle : " + tw.speed(t) + " m/s");
	}
}

package trimester6;

import java.io.*;

interface Faculty
{
	boolean giveMarks();
}

interface Student2
{
	void celebrate(boolean flag);
}

class Admin implements Faculty, Student2
{
	int marks=0;
	public boolean giveMarks()
	{
		marks = (int)(Math.random()*(100-0));
		if(marks>=40)
			return true;
		else
			return false;
	}
	public void celebrate(boolean flag)
	{
		if(flag == true)
			System.out.println("Celebrate");
		else
			System.out.println("Cry");
	}
	
}

public class Interfaces2
{
	public static void main(String []args)throws IOException
	{
		boolean f;
		
		Admin ob = new Admin();
		f = ob.giveMarks();
		ob.celebrate(f);
	}
}
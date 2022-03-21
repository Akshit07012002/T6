package trimester6;

//write a program to print a mathematical table of a given number

import java.io.*;

public class Table 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter the integer whose table you wish to see : ");
		int num = Integer.parseInt(in.readLine());
		
		System.out.print("till : ");
		int n = Integer.parseInt(in.readLine());
		
		System.out.println();
		System.out.println("-----------------------------");
		System.out.println("        TABLE OF " + num);
		System.out.println("-----------------------------");
		
		for(int i=1; i<=n; i++)
			System.out.println("        " + num + " x " + i + " = " + (num*i));
		
		System.out.println("-----------------------------");
	}
}

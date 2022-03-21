package trimester6;

import java.io.*;

// write a program to find the sum of the digits of a given number

public class SumOfDigits 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter an integer : ");
		int n = Integer.parseInt(in.readLine());
		
		int s = 0;
		
		System.out.print("Sum of digits of " + n + " : ");
		
		while(n!=0)
		{
			s += n % 10; n /= 10;
		}
		
		System.out.print(s);
	}
}

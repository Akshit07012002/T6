package trimester6;

//write a program to find the sum of first n even numbers

import java.io.*;

public class Sum 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		
		int sum = 0;
		
		for(int i=0; i<=n; i++)
			sum += i;
		
		System.out.println("Sum of first " + n + " numbers : " + +sum);
	}
}

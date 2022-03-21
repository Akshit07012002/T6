package trimester6;

import java.io.*;

public class LargestOfThree
{
	public static void main(String []args)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String s[] = new String[1];
		
		s = in.readLine().split(" ");
		
		int max = (int)(Math.max(Integer.parseInt(s[0]), (int)Math.max(Integer.parseInt(s[1]), Integer.parseInt(s[2]))));

		System.out.println("Largest Value : " + max);
		
//		System.out.println(" Enter 3 integers : ");
//		System.out.print("  a : ");
//		int a = Integer.parseInt(in.readLine());
//		System.out.print("  b : ");
//		int b = Integer.parseInt(in.readLine());
	}
}

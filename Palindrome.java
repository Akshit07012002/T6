package trimester6;

import java.io.*;

public class Palindrome 
{
	public static void main(String []args)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String []s = new String[1];
		
		s = in.readLine().split("");
		
		int flag = 0;
		
		for(int i=0; i<s.length/2; i++)
			if(!(s[i].equalsIgnoreCase(s[s.length-1-i])))
			{
				flag++; break;
			}
		
		if(flag == 0)
			System.out.println("It is a Palindrome.");
		else
			System.out.println("It is NOT a Palindrome.");
	}
}

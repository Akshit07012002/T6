package trimester6;

import java.io.*;

public class Capitalize 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String []s = new String[1];
		
		s = in.readLine().split(" ");
		
		for(int i=0; i<s.length; i++)
			System.out.print(Character.toUpperCase(s[i].charAt(0)) + s[i].substring(1) + " ");
	}

}

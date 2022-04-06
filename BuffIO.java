package trimester6;

import java.io.*;

public class BuffIO 
{
	public static void main(String []args)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedWriter op = null;
		
		try
		{
			op = new BufferedWriter(new FileWriter("D:\\op.txt"));
			
			int temp;
			while((temp = Integer.parseInt(in.readLine())) != -1)
			{
				System.out.println(temp);
				op.write(temp);
			}
		}
		
		finally
		{
//			if(in != null)
//				in.close();
			if(op != null)
				op.close();
		}
	}
}

package trimester6;

import java.io.*;

public class IO 
{
	public static void main(String []args)throws IOException
	{
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
//		FOR BYTE STREAM
//		FileInputStream source = null;
//		FileOutputStream target = null;
//		
		String inputFileDest = "C:\\source.txt";
		String outputFileDest = "D:\\target.txt";
		
//		FOR CHAR STREAM
		FileReader fileSource = null;
		FileWriter fileTarget = null;
		
		try
		{
//			d:\\Java T6\\sourcefile.txt
//			source = new FileInputStream(inputFileDest);
//			target = new FileOutputStream(outputFileDest);
			
			
			fileSource = new FileReader(inputFileDest);
			fileTarget = new FileWriter(outputFileDest);
			
			//Reading source file and writing content to target file byte by byte
			
//			int temp;
//			while((temp = source.read()) != -1)
//			{
//				System.out.println(temp);
//				target.write((byte)temp);
//			}
			
			int temp;
			while((temp = fileSource.read()) != -1)
			{
				System.out.println(temp);
				fileTarget.write((byte)temp);
			}
		}
		
//		catch(Exception e)
//		{
//			System.err.println("Exception");
//		}
		
		finally
		{
//			if(source != null)
//				source.close();
//			if(target != null)
//				target.close();
			
			if(fileSource != null)
				fileSource.close();
			if(fileTarget != null)
				fileTarget.close();
		}
	}
}

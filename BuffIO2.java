package trimester6;

import java.io.*;

public class BuffIO2 
{
	public static void main(String []args)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedWriter op = null;
		
		try
		{
			//op = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\out2.txt")));
			
			op = new BufferedWriter(new FileWriter("D:\\output0.txt", true));
			
			
			System.out.print("Enter the number of students : ");
			int stud = Integer.parseInt(in.readLine());
			
			int marks[] = new int[5];
			int total[] = new int[stud];
			double avg[] = new double[stud];
			
			for(int i=0; i<stud; i++)
			{
				total[i] = 0; 
				avg[i] = 0d;
			}
			
			
			//String marks1[] = new String[5];
			String names[] = new String[stud];
			
			for(int i=0; i<stud; i++)
			{
				op.newLine();
				System.out.print("Enter the name of student " + (i+1) + " : ");
				names[i] = in.readLine();
				op.write(("      STUDENT " + (i+1))); op.newLine();
				op.write(("Name : " + names[i]));
				op.newLine();
				for(int j=0; j<5; j++)
				{
					System.out.print("Enter the marks of student " + (i+1) + " for subject " + (j+1) + " : ");
					marks[j] = Integer.parseInt(in.readLine());
					op.write(("Subject " + (j+1) + " : " + Integer.toString(marks[j])));
					op.newLine();
					total[i] += marks[j]; 
				}

				avg[i] = total[i]/5.0;
				
				if(avg[i]>=90)
					op.write(("Grade : A+"));
				if(avg[i]<90 && avg[i]>=80)
					op.write(("Grade : A"));
				if(avg[i]<80 && avg[i]>=70)
					op.write(("Grade : B+"));
				if(avg[i]<70 && avg[i]>=60)
					op.write(("Grade : B"));
				if(avg[i]<60 && avg[i]>=50)
					op.write(("Grade : C+"));
				if(avg[i]<50 && avg[i]>=40)
					op.write(("Grade : C"));
				if(avg[i]<40)
					op.write(("Grade : F"));
				
				op.newLine();
				op.write(("Total : " + Integer.toString(total[i])) );
				op.newLine();
				op.write(("Avg : " + Double.toString(avg[i])));
				op.newLine();
			}
			
			
		}
		
		finally
		{
			if(in != null)
				in.close();
			if(op != null)
				op.close();
		}
	}
}

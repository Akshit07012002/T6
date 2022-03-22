package trimester6;

import java.io.*;

public class Lab2 
{		
	public static void main(String[] args)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int choice = 1;

		System.out.print("\n   Enter the Number of Students : ");
		int n = Integer.parseInt(in.readLine());
		
		Student s[] = new Student[n];

		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		do 
		{
			
			System.out.println("            STUDENT DATABASE");
			System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			System.out.println("\n            1) Enter Data");
			System.out.println("            2) Display Data");
			System.out.println("            3) Exit");
			System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			
			System.out.print("\n            Enter choice : ");
			choice = Integer.parseInt(in.readLine());
			
			switch(choice)
			{
				case 1:
										
					for(int i=0;i<n;i++)
					{
						System.out.println("\n-----------------------------------------");
						System.out.println("\t       STUDENT " + (i+1) );
						System.out.println("-----------------------------------------");
						s[i] = new Student();
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
					}
					
					break;
				case 2:
					for(int i=0;i<n;i++)
					{
						System.out.println("\n-----------------------------------------");
						System.out.println("\t       STUDENT " + (i+1) );
						System.out.println("-----------------------------------------");
						s[i].disp();
					}
					break;
				case 3:
					System.out.println("\t     TERMINATING.");
				default:
					return;
					
			}
			
		}while(choice!=3);
		
		
		
		
	}
	
}

class Student
{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	String name, finalGrade, grade[] = new String[5], subjects[] = {"Math", "Physics", "Chemistry", "Biology", "Computer Science"};
	int roll, n, total; int m[] = new int[5];
	double avg = 0.0d;
	
	Student()throws IOException
	{ 
		System.out.print("  Name : "); name = in.readLine();
		System.out.print("  Roll No : "); roll = Integer.parseInt(in.readLine());
		getData();
	}
	
	public void getData() throws IOException
	{
		System.out.println("  Marks");
		for(int i=0; i<5; i++)
		{
			System.out.print("\t  " + subjects[i] + " : ");
			m[i] = Integer.parseInt(in.readLine()); 
			grade[i] = calc(m[i]);
			total += m[i];
		}
		avg = total/5.0;
		finalGrade = calc((int)avg);
	}
	
	public String calc(int m)
	{
		if(m>=90)
			return("A+");
		if(m<90 && m>=80)
			return("A");
		if(m<80 && m>=70)
			return("B+");
		if(m<70 && m>=60)
			return("B");
		if(m<60 && m>=50)
			return("C+");
		if(m<50 && m>=40)
			return("C");
		return("F");
	}
	
	public void disp()
	{
		System.out.println("  Name : " + name); 
		System.out.println("  Roll No : " + roll);
		System.out.println("      GRADES");
		for(int i=0; i<5; i++)
			System.out.println("\t  " + subjects[i] + " : " + grade[i]);
		
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		System.out.println("\t  AVERAGE MARKS : " + avg);
		System.out.println("\t  FINAL GRADE : " + finalGrade);
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
	}
	
}
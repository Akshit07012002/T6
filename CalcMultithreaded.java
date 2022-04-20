package trimester6;

import java.io.*;

class Add implements Runnable
{

	double a, b;
	Add(double x, double y)
	{
		a = x;
		b = y;
	}
	public void run()
	{
		
		try
		{
			//System.out.print(" ADDING : ");
			System.out.println( " ADDING : "+ a + " + " + b + " = " + (a+b));
		}
		catch(Exception e)
		{
			System.out.println("Exception caught.");
		}
	}
}

class Sub implements Runnable
{
	double a, b;
	Sub(double x, double y)
	{
		a = x;
		b = y;
	}
	public void run()
	{
		
		try
		{
			//System.out.print(" SUBTRACTING : ");
			System.out.println( " SUBTRACTING : "+ a + " - " + b + " = " + (a-b));
		}
		catch(Exception e)
		{
			System.out.println("Exception caught.");
		}
	}
}

class Mul implements Runnable
{
	double a, b;
	Mul(double x, double y)
	{
		a = x;
		b = y;
	}
	public void run()
	{
		
		try
		{
			//System.out.print(" MULTIPLYING : ");
			System.out.println( " MULTIPLYING :  "+ a + " * " + b + " = " + (a*b));
		}
		catch(Exception e)
		{
			System.out.println("Exception caught.");
		}
	}
}

class Div implements Runnable
{
	double a, b;
	Div(double x, double y)
	{
		a = x;
		b = y;
	}
	public void run()
	{
		
		try
		{
			//System.out.print(" DIVIDING : ");
			if(b==0)
				throw new ArithmeticException(" !!! CANNOT DIVIDE BY ZERO !!!");
			System.out.println( " "+ a + " / " + b + " = " + (a/b));
		}
		catch(ArithmeticException e)
		{
			System.out.println(" DIVIDING : " + e.getMessage());
		}
	}
}

public class CalcMultithreaded 
{
		public static void main(String []args)throws IOException
		{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print(" Enter number 1 : ");
			double aa = Double.parseDouble(in.readLine());
			System.out.print(" Enter number 2 : ");
			double bb = Double.parseDouble(in.readLine());
			
			
			Thread a = new Thread(new Add(aa,bb));
			Thread s = new Thread(new Sub(aa,bb));
			Thread m = new Thread(new Mul(aa,bb));
			Thread d = new Thread(new Div(aa,bb));
			
			a.start();
			s.start();
			m.start();
			d.start();
			
//			do
//			{
//				System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
//				System.out.println("              CALCULATOR ");
//				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
//				System.out.println("           1) ADD ");
//				System.out.println("           2) SUBTRACT");
//				System.out.println("           3) MULTIPLY");
//				System.out.println("           4) DIVIDE");
//				System.out.println("           5) EXIT");
//				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
//				
//
//				System.out.print("    CHOOSE YOUR OPTION : ");
//				ch = Integer.parseInt(in.readLine());
//				
//				switch(ch)
//				{
//					case 1: System.out.print("  ADDITION ");
//							Add ob = new Add();
//							ob.run();
//							break;
//							
//							
//					case 2: System.out.print("    ENTER SAVINGS A/C DETAILS \n    Name : ");
//							break;
//							
//					case 3: System.out.println("-----------------------------------\n        CURRENT A/Cs");
//							
//							break;
//					
//					case 4: System.out.println("   THANK YOU FOR CHOOSING OUR SERVICE :)");break;		
//							
//					case 5: System.out.println("   THANK YOU FOR CHOOSING OUR SERVICE :)");break;
//					
//					default:
//						System.out.println("   Invalid Input. Restarting sessions.");
//				}
//				
//			}while(ch!=4);
		}
}

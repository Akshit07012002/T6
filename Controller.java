package trimester6;

import java.io.*;

class MyException extends Exception
{
	public MyException(String s)
	{
		super(s);
	}
}

class Customer
{
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	static int id = 0;
	String name;
	int acNum, wCount, dCount;
	double wd[] = new double[10], dep[] = new double[10], balance;
	
	Customer()
	{
		name = "";
		acNum = 0;
		wCount = -1;
		dCount = 1;
		balance = 0;
	}
	
	Customer(String n, int ac)
	{
		name = n;
		acNum = ac;
	}
	
	public void create()throws IOException
	{
		int flag = 0;
		
		do
		{
			try
			{
				System.out.print("    Enter the initial deposit amount (>Rs.1000) : Rs.");
				dep[0] = Double.parseDouble(in.readLine());
				if(dep[0] < 1000)
					throw new MyException("    !!! Initial Deposit Must Be Over Rs.1000 !!! ");
				balance += dep[0];
				flag = 0;
			}
			catch(MyException e)
			{
				//System.out.println("    !!! Initial Deposit Must Be Over Rs.1000 !!! ");
				System.out.println(e.getMessage()); flag = 1;
			}
			
		}while(flag == 1);
		
	}
	
	public void withdraw()throws IOException
	{
		int f = 0;
		do
		{
			System.out.println("    BALANCE : " + balance);
			try
			{
				System.out.print("    Enter the withdrawal amount : Rs.");
				wd[wCount] = Double.parseDouble(in.readLine());
//				System.out.println(wCount + " " + wd[wCount] );
				if(wd[wCount] > balance)
					throw new MyException("    !!! INSUFFICIENT BALANCE !!! ");
				balance -= wd[wCount];
				System.out.println("    BALANCE : " + balance);
				wCount++;
				f = 0;
			}
			catch(MyException e)
			{
				System.out.println(e.getMessage()); f = 1;
			}
			
		}while(f == 1);
		
	}
	
	public void deposit()throws IOException
	{
		dCount++;
		System.out.print("    Enter the deposit amount : Rs.");
		dep[dCount] = Double.parseDouble(in.readLine());
		balance += dep[dCount];
	}
	
	public void statement()
	{		
		System.out.println("-----------------------------------\n        A/C STATEMENT \n-----------------------------------\n");
		System.out.println(" NAME : " + name + "\n A/C NUMBER : " + acNum);
		System.out.println(" WITHDRAWALS\t|\tDEPOSITS");
		for(int i=0; i<= Math.max(dCount, wCount); i++)
			System.out.println("    "+((i<wCount)?wd[i]:" -- ") + "   \t\t" + ((i<dCount)?dep[i]:" -- "));
		System.out.println("-----------------------------------\n ");
	}
	
}

public class Controller 
{
	
	public static void main(String []args)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int ch = 1; int size = 10;
		
		int count = 0;		
		String cname;
		int ac = 0;
		double amountW, amountD;
		
		Customer c[] = new Customer[size];
		
		do
		{
			
			
			System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			System.out.println("              ABC BANK ");
			System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			System.out.println("           1) CREATE ACCOUNT ");
			System.out.println("           2) WITHDRAWAL");
			System.out.println("           3) DEPOSIT");
			System.out.println("           4) ACCOUNT STATEMENT");
			System.out.println("           5) EXIT");
			System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			

			System.out.print("    CHOOSE YOUR OPTION : ");
			ch = Integer.parseInt(in.readLine());
			
			switch(ch)
			{
				case 1: 
						count++;
						System.out.print("    ENTER A/C DETAILS \n    Name : ");
						cname = in.readLine();
						int f = 0;
						do
						{
							try
							{
								System.out.print("    A/C Number (between 1 & 20) : ");
								ac = Integer.parseInt(in.readLine());
								if(ac < 1 || ac > 20)
									throw new MyException("    !!! INVALID AC NUMBER !!! ");
								f = 0;
							}
							catch(MyException e)
							{
								System.out.println(e.getMessage()); f = 1;
							}
							
						}while(f == 1);
						
						c[count] = new Customer(cname,ac); 
						
						c[count].create(); break;
						
						
				case 2: System.out.println("    CURRENT USER LOGGED IN : " + count);
						c[count].withdraw();
						break;
						
				case 3:	System.out.println("    CURRENT USER LOGGED IN : " + count);
						c[count].deposit();
						break;
						
				case 4: System.out.println("    CURRENT USER LOGGED IN : " + count);
						c[count].statement();
						break;
						
				case 5: System.out.println("   THANK YOU FOR CHOOSING OUR SERVICE :)");break;
				
				default:
					System.out.println("   Invalid Input. Restarting sessions.");
			}
			
		}while(ch!=5);
		
	}	
}

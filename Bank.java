package trimester6;

import java.io.*;

class Account
{
	
	String name;
	int acNum, mobNum;
	double rateSavings, rateCurrent, interest, loan;
	
	Account()
	{
		name = "";
		acNum = mobNum = 0;
		rateSavings = rateCurrent = interest = loan = 0;
	}
	
	Account(String n, int ac, int mb, double l)
	{
		name =  n;
		acNum = ac;
		mobNum = mb;
		rateSavings = 12.5; 
		rateCurrent = 8;
		loan = l;
	}
	
	double calcInterest(int code)
	{
		interest = loan * rateCurrent * 6;
		return interest;
	}
	
	double calcInterest(double code)
	{
		interest = loan * rateSavings * 6;
		return interest;
	}
	
}

public class Bank 
{
	public static void main(String []args)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int ch = 1;

		Account c[] = new Account[5]; Account s[] = new Account[5];
		
		int countC = 0; int countS = 0;
		
		String n;
		int ac, mb;
		double rs, rc, l;
		
		do
		{
			
			
			System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			System.out.println("        ABC BANK - LOAN DETAILS ");
			System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			System.out.println("           1) CURRENT ");
			System.out.println("           2) SAVINGS ");
			System.out.println("           3) PRINT DATABASE");
			System.out.println("           4) EXIT");
			System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			

			System.out.print("    CHOOSE YOUR OPTION : ");
			ch = Integer.parseInt(in.readLine());
			
			switch(ch)
			{
				case 1: System.out.print("    ENTER CURRENT A/C DETAILS \n    Name : ");
						n = in.readLine();
						System.out.print("    A/C Number : ");
						ac = Integer.parseInt(in.readLine());
						System.out.print("    Mobile Number : ");
						mb = Integer.parseInt(in.readLine());
						System.out.print("    Enter the desired loan amount : Rs.");
						l = Double.parseDouble(in.readLine());
						
						c[countC] = new Account(n,ac,mb,l); 
						
						System.out.println(	"    Interest after 6 months : Rs."+ c[countC].calcInterest(1));
						countC++; break;
						
						
				case 2: System.out.print("    ENTER SAVINGS A/C DETAILS \n    Name : ");
						n = in.readLine();
						System.out.print("    A/C Number : ");
						ac = Integer.parseInt(in.readLine());
						System.out.print("    Mobile Number : ");
						mb = Integer.parseInt(in.readLine());
						System.out.print("    Enter the desired loan amount : ");
						l = Double.parseDouble(in.readLine());
						
						s[countS] = new Account(n,ac,mb,l); 
						System.out.println(	"    Interest after 6 months : "+ s[countS].calcInterest(2.0d));
						
						
						countS++;break;
						
				case 3: System.out.println("-----------------------------------\n        CURRENT A/Cs");
						System.out.println(" NAME\t|\tA/C\t|\tMOB\t|\tINTEREST");
						for(int i=0; i<countC; i++)
							System.out.println(c[i].name + "\t\t" + c[i].acNum + "\t\t" + c[i].mobNum + "\t\t" + c[i].interest);
						System.out.println("-----------------------------------\n        SAVINGS A/Cs");
						for(int i=0; i<countS; i++)
							System.out.println(s[i].name + "\t\t" + s[i].acNum + "\t\t" + s[i].mobNum + "\t\t" + s[i].interest);
						break;
						
				case 4: System.out.println("   THANK YOU FOR CHOOSING OUR SERVICE :)");break;
				
				default:
					System.out.println("   Invalid Input. Restarting sessions.");
			}
			
		}while(ch!=4);
		
		
	}
}

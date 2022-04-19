/**
 *  Code By : AKSHIT MAHAUR
 *  GITHUB : https://github.com/Akshit07012002
 */

package trimester6;

import java.io.*;

class M1 extends Thread
{
	
	public void run()
	{
		try
		{
			System.out.println("  Inside run() method isAlive : " + Thread.currentThread().isAlive());
		}
		catch(Exception e)
		{
			System.out.println("  Exception caught.");
		}
	}
}


class M2 implements Runnable 
{
	public void run()
	{
		try
		{
			System.out.println("  ORIGINAL PRIORITY OF Thread " + Thread.currentThread().getName() + " with priority " + Thread.currentThread().getPriority() + " is running." );
			
			if(Thread.currentThread().getPriority() == Thread.MAX_PRIORITY)
				Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
			
			Thread.sleep(5000);
			
			System.out.println("  NEW PRIORITY OF Thread " + Thread.currentThread().getName() + " with priority " + Thread.currentThread().getPriority() + " is running." );
			
		}
		
		catch(Exception e)
		{
			System.out.println("  Exception is caught");
		}
	}
}



public class MulThread
{
	public static void main(String[] args) throws IOException
	{
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("\n--------------------------------------------\n \t\t CLASS M1 \n--------------------------------------------\n");
		
		M1 o1 = new M1();
		M1 o2 = new M1();
		
		// using join()
        System.out.println("  O1 before starting thread isAlive : " + o1.isAlive());   
        o1.start(); 
        try 
        {
        	o1.join();
        }
        catch(Exception e) {}
        System.out.println("  O1 after starting thread isAlive : " + o1.isAlive());
        
        // without using join()
        System.out.println("\n  O2 before starting thread isAlive : " + o2.isAlive());   
        o2.start(); 
        System.out.println("  O2 after starting thread isAlive : " + o2.isAlive());
		
		
		try {
			o2.join();
		} catch (Exception e) {}
		
		
		System.out.print("\n--------------------------------------------\n  Enter the number of threads : ");
		int n = Integer.parseInt(in.readLine()); 
		
		System.out.println("\n--------------------------------------------\n \t\t CLASS M2 \n--------------------------------------------\n ");
	    for (int i = 0; i < n; i++) 
	    {
	        Thread obj = new Thread(new M2(), ("number " + (i+1)));
	            
	         if(i==0)
	        	obj.setPriority(Thread.MAX_PRIORITY);
	            
//	         if(i==7)
//	            ob[i].setPriority(Thread.MIN_PRIORITY);
	            
	         obj.start();
	    }
	}
}

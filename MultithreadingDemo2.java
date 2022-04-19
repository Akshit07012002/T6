package trimester6;


//implementing the Runnable interface
class Multithread2 implements Runnable 
{
	public void run()
	{
		try
		{
			System.out.println("ORIGINAL PRIORITY OF Thread " + Thread.currentThread().getName() + " with priority " + Thread.currentThread().getPriority() + " is running." );
			
			if(Thread.currentThread().getPriority() == Thread.MIN_PRIORITY)
				Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
			
			Thread.sleep(5000);
			
			System.out.println("\tNEW PRIORITY OF Thread " + Thread.currentThread().getName() + " with priority " + Thread.currentThread().getPriority() + " is running." );
			
		}
		
		catch(Exception e)
		{
			System.out.println("Exception is caught");
		}
	}
}

public class MultithreadingDemo2 
{
	 public static void main(String[] args)
	    {		 	
	        int n = 8; 
		 
		 	Thread ob[] = new Thread[n];// Number of threads
	        for (int i = 0; i < n; i++) 
	        {
	            ob[i] = new Thread(new Multithread2(), ("number " + (i+1)));
	            
	            if(i==0)
	            	ob[i].setPriority(Thread.MAX_PRIORITY);
	            
	            if(i==7)
	            	ob[i].setPriority(Thread.MIN_PRIORITY);
	            
	            ob[i].start();
	        }
	    }
}

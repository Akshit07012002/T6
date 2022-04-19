package trimester6;

//extending the Thread class
class Multithread extends Thread
{
	Multithread(String s)
	{
		super(s);
	}
	
	public void run()
	{
		try
		{
			System.out.println("Thread " + Thread.currentThread().getName() + " is running.");
		}
		catch(Exception e)
		{
			System.out.println("Exception caught.");
		}
	}
}

public class MultithreadingDemo 
{
	public static void main(String []args)
	{
		int n = 5;
		for(int i=0; i<n; i++)
		{
			Multithread ob = new Multithread("number " + (i+1));
			//ob.setName("some");
			ob.start();
		}
	}
}

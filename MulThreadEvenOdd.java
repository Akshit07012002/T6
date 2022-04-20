package trimester6;

class printEvenOdd {

int cnt = 1;
static int N = 10;

public void printOddnumber()
{
	while(cnt < N)
	{
		while(cnt % 2 == 1){
		
		System.out.println(cnt + " ");
		cnt++;
		}
	}							
}

public void printEvennumber()
{
	while(cnt < N)
	{
		while(cnt % 2 == 0){
		
		System.out.println(cnt + " ");
		cnt++;
		}
	}
}


}
public class MulThreadEvenOdd {

	public static void main(String[] args) {
	printEvenOdd p = new printEvenOdd();
	Thread t1 = new Thread(new Runnable()
	{
		public void run()
		{
			p.printEvennumber();
		}
		});
		
		Thread t2 = new Thread(new Runnable()
		{
			public void run()
			{
				p.printOddnumber();
			}
		});
	
	t1.start();
//	try 
//	{
//		t1.join();
//	} 
//	catch (InterruptedException e) 
//	{
//		e.printStackTrace();
//	}
	t2.start();
	
	}

}

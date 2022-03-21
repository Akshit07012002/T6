package trimester6;

// write a program to print 1-100 Even numbers without using the % operator

public class Tricky1 
{
	public static void main(String[] args) 
	{
		for(int i=2; i<100; i=i+2)
			System.out.print(i + ", ");
		
		System.out.print(100);
	}
}

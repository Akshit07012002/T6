package trimester6;

import java.util.*;
import java.io.*;

public class HashTest {
	
	HashSet<Integer> s;

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args)throws IOException {
				
		int conditionFlag = 1, ch = 0;
		
		HashTest ob = new HashTest();
		
		do
		{
			
			System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			System.out.println("                ACTIVE LEARNING - HASHSET ");
			System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			System.out.println("           1) CREATE HASHSET ");
			System.out.println("           2) DISPLAY ");
			System.out.println("           3) GET SIZE");
			System.out.println("           4) APPEND ELEMENT AT SPECIFIC POSITION");
			System.out.println("           5) CHECK IF EMPTY");
			System.out.println("           6) CONVERT TO ARRAY");
			System.out.println("           7) EXIT");
			System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			

			System.out.print("    CHOOSE YOUR OPTION : ");
			ch = Integer.parseInt(in.readLine());
			
			switch(ch)
			{
				case 1: ob.create(); break;
				
				case 2: ob.display(); break;
			
				case 3: ob.getSize(); break;
				
				case 4: ob.append(); break;
				
				case 5: ob.emptyCheck(); break;
				
				case 6: ob.convertToArray(); break;
				
				case 7: conditionFlag = 7; break;
				
				default: System.out.println("     INVALID INPUT. TERMINATING. ");
			}
			
		}while(conditionFlag != 7);
		
		
		
	
		
		
	}
	
	void create()throws IOException
	{
		// Instantiation of the HashSet class which implements Set Interface ('s' as an Object of HashSet) 
		s = new HashSet<>();
		
		int flag = 1;
		
		// Adding elements to the HashSet
		while(flag!=0)
		{
			System.out.print("\t Add Element : ");
			s.add(Integer.parseInt(in.readLine()));
			System.out.print("\t Press 1 to add more, 0 to stop adding : ");
			flag = Integer.parseInt(in.readLine());
		}
			
				
	}
	
	void getSize()
	{
		System.out.println("\n\t Size : " + s.size());
	}
	
	void display()
	{
		System.out.print("\t HashSet : ");
		// Using the Iterator interface for iteration purposes
		Iterator<Integer> it = s.iterator();
		
		while(it.hasNext())
		{
			System.out.print(it.next() + " ");
		}
		
	}
	
	void append()
	{
		System.out.println(" OOPS! The HashSet is an UNORDERED Collection! \n\t CANNOT ADD TO A SPECIFIC POSITION HERE!");
	}
	
	void emptyCheck()
	{
		System.out.println((s.isEmpty()) ? "\n\t THE HASHSET IS EMPTY " : "\n\t THE HASHSET IS NOT EMPTY " );
	}
	
	void convertToArray()
	{
		Integer[] set = new Integer[s.size()];
		s.toArray(set);

		System.out.print("\t Integer array : [ ");
		for(int i=0; i<s.size()-1; i++)
			System.out.print(set[i] + ", ");
		System.out.println(set[s.size()-1] + " ] ");
		
	}
	
}

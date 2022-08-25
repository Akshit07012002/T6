package trimester6;

//check duplicates

import java.io.*;
import java.util.*;

public class ArrayStriver01 {

	public static void main(String[] args) throws IOException{
		
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		
//		int[] a = new int[n];
		
		HashSet<Integer> s = new HashSet<>();
		
		// unordered list, but with no duplicates.
		
		int flag = 0;
		int x = 0;
		int dup = 0;
		
		for(int i = 0; i<n ; i++)
		{
			x = Integer.parseInt(in.readLine());
			if(s.contains(x)) {
				flag=1;
				dup = x;
				break;
			}
			else
				s.add(x);
		}
		
		if(flag == 1)
			System.out.println(dup);

	}

}

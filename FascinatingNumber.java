package trimester6;

import java.io.*;
import java.util.*;

public class FascinatingNumber {

	public static void main(String[] args) throws IOException{
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		Set<Integer> s = new HashSet<>();
		
		int n = Integer.parseInt(in.readLine());
//		int copy = n;
		int temp = 0;
		int  r = 0;
		temp = n + (2*n) + (3*n);
		
		while(temp!=0) {
			
			r = temp % 10;
			s.add(r);
		}
		
		if(s.size() != 9)
			System.out.println("Not Fascinating.");
		else
			System.out.println("Fascinating.");
		
	}

}

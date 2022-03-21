package trimester6;

import java.io.*;

public class VotingEligiblity 
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int age = Integer.parseInt(in.readLine());
		
		System.out.println((age>=18)?"Eligible. Please do vote.":("Not Eligible. Come back " + (18-age) + ((18-age == 1)?" year later." : " years later.")));
	}

}

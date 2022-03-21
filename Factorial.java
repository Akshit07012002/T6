package trimester6;

import java.io.*;

public class Factorial 
{
    public static void main(String []args)throws IOException
    {
       	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a number : ");
        int n = Integer.parseInt(in.readLine());
        int f = 1;
        for(int i=2; i<=n; i++)
        { 
              f = f * i;
         }
        System.out.println("Factorial : " + f);
    }
}

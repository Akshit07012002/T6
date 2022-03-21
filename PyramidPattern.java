package trimester6;

import java.io.*;

public class PyramidPattern
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());

         for(int i=0; i<n; i++) 
         {
             for(int j=n-i; j>1; j--)
                 System.out.print(" ");

             for(int j=0; j<=i; j++ ) 
                 System.out.print("* "); 

             System.out.println(); 
         } 

    } 

}

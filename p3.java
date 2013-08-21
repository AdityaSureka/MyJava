 /* Arithmetic Exception Handling 
  * 
  * by Aditya Sureka
  */ 

import java.io.*;
public class p3
{
    public static void main(String args[])throws IOException
        {
            
            try
            {
                BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter value of x");
                int x=Integer.parseInt(in.readLine());
                System.out.println("enter value of y");
                int y=Integer.parseInt(in.readLine());
                int sum=(x/(x-y));
              
            }
            catch(ArithmeticException e)
            {
                System.out.println("x should not be equal to y"+e);
            }
            catch(NumberFormatException e)
            {
                Sytem.out.println("invalid input");
            }
        }
    }
    
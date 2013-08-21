 /* Arithmetic Exception Handling 
  * 
  * by Aditya Sureka
  */

import java .io.*;
public class p1
{
    public static void main(String args[])throws IOException
    {
        try
            {
                BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter value of x");
                int x=Integer.parseInt(in.readLine());
                if(x<0)
                {
                    System.out.println("ERROR");
                    throw new Exception("x is less than 0");
                }
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
                
         
                
                
              
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
    
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
         
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
        
 /* LCM using loop
  * 
  * by Aditya Sureka
  */import java.io.*;
    public class program15
    {
      public static void main(String args[])throws IOException
      {   
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the two nos.");
    int big=Integer.parseInt(br.readLine());
    int small=Integer.parseInt(br.readLine());
    int rem=1;
   while(rem!=0)
    {
        rem=big%small;
        if(rem!=0)
        {
            big=small;
            small=rem;

        }
    }
    System.out.println(small);
    }}
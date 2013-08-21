 /* Find HCF of two numbers using recursion 
  * 
  * by Aditya Sureka
  */
import java.io.*;
class recursivehcf
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input bigger number");
        int b=Integer.parseInt(stdin.readLine());
        System.out.println("Input smaller number");
        int s=Integer.parseInt(stdin.readLine());
        int c=s;
        hcf(b,s,c);
    }
    public static void hcf(int big, int small, int rem)
    {
        if(big==small)
        {
            System.out.println(+big);
        }
        else if(big%small!=0)
        {
            rem=big%small;
            big=small;
            small=rem;
            hcf(big,small,rem);
        }else{
            System.out.println(+rem);
        }
    }
}
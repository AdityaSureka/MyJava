 /* Recursive Power
  * 
  * by Aditya Sureka
  */import java.io.*;
class recursivepower
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input a and b");
        int a=Integer.parseInt(stdin.readLine());
        int b=Integer.parseInt(stdin.readLine());
        int c=1;
        power(a,b,c);
    }
    public static void power(int x, int y, int z)
    {
        if(y>0)
        {
            z=z*x;
            y--;
            power(x,y,z);
        }else{
            System.out.println(+z);
        }
    }
}
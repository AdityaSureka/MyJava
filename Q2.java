import java.io.*;
public class Q2
{
static int f=1;
public static void main(String args[])throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter no.");
int a=Integer.parseInt(in.readLine());
fac(a+1);
}
public static void fac(int x)
{
x=x-1;

if(x!=1)
{f=f*x;
fac(x);

}if(x==1) 
System.out.println(f);
}
}


import java.io.*;
public class Q3
{
static int h;
public static void main(String args[])throws Exception
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the nos.");
int a=Integer.parseInt(in.readLine());
int b=Integer.parseInt(in.readLine());
if(a>b)
hcf(a,b);
else
hcf(b,a);
System.out.println(h);
}
public static void hcf(int a,int b)
{
if(b>1)
{
h=b;
b=a%b;
a=h;
hcf(a,b);
}
else if(b==1)
System.out.println("1");
}
}
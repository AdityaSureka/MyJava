import java.io.*;
public class recursion1
{
public static void main(String args[])throws IOException
{

BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter base");
int a=Integer.parseInt(in.readLine());
System.out.println("enter power");
int b=Integer.parseInt(in.readLine());
int n=a;
recur(a,b,n);
}
public static void recur(int x,int y,int z)
{

if(y>1)
{
x=x*z;
recur(x,y-1,z);
}
if(y==1)
System.out.println("output:"  +x);
}
}
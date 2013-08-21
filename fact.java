import java.io.*;
public class fact
{
public static void main(String args[])throws IOException
{

BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter no");
int n=Integer.parseInt(in.readLine());
double a=1;
recur(n,a);
}
public static void recur(int x,double y)
{
if(x>0)
{
y=y*x;
x--;
recur(x,y);
}
if(x==1)
System.out.println("FACTORIAL: " +y);
}
}

import java.io.*;
public class Q1
{
static int z=1;
public static void main(String args[])throws Exception
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.println();
int a=Integer.parseInt(in.readLine());
int b=Integer.parseInt(in.readLine());
pow(a,b+1);
}

public static void pow(int x,int y)
{
y=y-1;
if(y!=0)
{
z=z*x;
pow(x,y);
}
if(y==0)
System.out.println(z);
}
}

import java.io.*;
public class hcf
{
public static void main(String args[])throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter nos.");
int x=Integer.parseInt(in.readLine());
int y=Integer.parseInt(in.readLine());
int r=100;
int ans=0;
if(x>y)
recur(x,y,r,ans);
else
if(x<y)
recur(y,x,r,ans);
}
public static void recur(int d,int div,int rem,int z)
{
if(rem>=1)
{
rem=d%div;
d=div;
div=rem;
if(rem==0)
{
z=d;
}
if(rem!=0)
recur(d,div,rem,z);
}
if(rem==0)
System.out.println("HCF: " +z);
}
}
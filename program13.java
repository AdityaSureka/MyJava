 /* Pattern
  * 
  * by Aditya Sureka
  */
 import java.io.*;
public class program13
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number of rows");
int r=Integer.parseInt(br.readLine());

int i,j;
for(i=1;i<=r;i++)
{
for(j=1;j<=i;j++)
System.out.print("*");
System.out.println();
}
for(i=(r-1);i>=1;i--)
{
for(j=1;j<=i;j++)
System.out.print("*");
System.out.println();
}
}
}
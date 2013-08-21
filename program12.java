 /* pattern
  * 
  * by Aditya Sureka
  */
import java.io.*;
public class program12
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number of rows");
int r=Integer.parseInt(br.readLine());
System.out.println("Enter the number of colums");
int c=Integer.parseInt(br.readLine());

int i,j;
for(i=1;i<=r;i++)
{
for(j=1;j<=c;j++)
{
if(j%2!=0)
System.out.print("*");
else
System.out.print("+");
}
System.out.println();
}
}
}
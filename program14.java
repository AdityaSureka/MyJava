 /* Create a pattern
  *     *
  *    ***
  *   *****
  *    ***
  *     *
  * by Aditya Sureka
  */  import java.io.*;
  public class program14
  {
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number of rows");
int r=Integer.parseInt(br.readLine());
  int i,j,p,d=0;
  int l=1;
  int s=(r-1);
  for(i=1;i<=r;i++)
  {
   for(p=1;p<=s;p++)
      {
        System.out.print(" ");
       }
   s--;
    if(i==(r-1))
     d=l;
      for(j=1;j<=l;j++)
       {
        System.out.print("*");
       }
   l=l+2;
    System.out.println();
     }
   s=1;
     for(i=r-1;i>=1;i--)
      {
        for(p=1;p<=s;p++)
      {
        System.out.print(" ");
      }
   s++;
  for(j=1;j<=d;j++)
  {
  System.out.print("*");
  }
  d=d-2;
  System.out.println();
  }
  }
  }

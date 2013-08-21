 /* Double Dimension Array
  * 
  * by Aditya Sureka
  */import java.io.*;
public class ddarray
{static int l;
static int k;
public static void main(String args[])throws Exception
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.println();
l=Integer.parseInt(in.readLine());
k=Integer.parseInt(in.readLine());
int a[][]=new int[l][k];
System.out.println("Enter values");
init(a,-1);

for(int i=0;i<l;i++)
{
for(int j=0;j<k;j++)
System.out.print(a[i][j]+" ");
System.out.println();
}}
public static void init(int x[][],int m)throws Exception
{BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
m=m+1;
if((m>=0)&&(m<l))
{
init2(x,m,-1);
init(x,m);
}}
public static void init2(int x[][],int m,int n)throws Exception
{BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
n=n+1;
if((n>=0)&&(n<k))
{
x[m][n]=Integer.parseInt(in.readLine());
init2(x,m,n);
}

}
}


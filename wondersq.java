import java.io.*;
class wondersq
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the size of the array");
int n=Integer.parseInt(br.readLine());
int a[][]=new int[n][n];
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
System.out.println("enter the array");
int m=Integer.parseInt(br.readLine());
a[i][j]=m;
}}
double s=0.5*n*(n*n)+1;
int sq=n*n,r=0,c=0,t=0,l=0,row=0,col=0;
int p[]=new int[sq];
int ri[]=new int[sq];
int ci[]=new int[sq];
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
t=0;
for(int k=1;k<=a[i][j];k++)
{
if(a[i][j]%k==0)
t++;
}
if(t==2)
{
p[l]=a[i][j];
ri[l]=i;
ci[l]=j;
l++;
}
row=row+a[i][j];
col=col+a[j][i];
}
if(row!=s)
r++;
if(col!=s)
c++;
row=0;
col=0;
}
if(r==0 && c==0)
{
System.out.print("wondrous square");
}
else
{
System.out.print("not a wondrous square"+sq+" " +c+" "+r);
}
for(int i=0;i<sq;i++)
{
if(p[i]!=0)
System.out.println(p[i]+" "+ri[i]+" "+ci[i]);
}
}
}




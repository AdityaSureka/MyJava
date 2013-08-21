 /* Series x-2x/2!+3x/3!...
  * 
  * by Aditya Sureka
  */
 import java.io.*;
class program11
{
static void main(String args[])throws IOException
{
BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number");
int n=Integer.parseInt(br.readLine());
System.out.println("enter the value for x");
int x=Integer.parseInt(br.readLine());
int t=-1,i,j;
float f=1;
double s=1;

for(i=2;i<=(2*n);i=i+2)
{f=1;
for(j=1;j<=i;j++)
f=f*j;
s=s+(t*((Math.pow(x,i)/f)));
t=t*(-1);
}
System.out.println(s);

}
}



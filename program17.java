import java.io.*;
class program17
{
static void main(String args[])throws IOException
{
BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
int m,n;
double o,l;
System.out.println("Enter the value of m,n");
m=Integer.parseInt(br.readLine());
n=Integer.parseInt(br.readLine());
o=power(m,n);
System.out.println(o);
System.out.println("Enter the number");
int x=Integer.parseInt(br.readLine());
l=power(x);
System.out.println(l);
}
static double power(int a,int b)
{
double r;
r=Math.pow(a,b);
return(r);
}
 static double power(int d)
 {
double p;
p=Math.pow(d,2);
return(p);
}
}     

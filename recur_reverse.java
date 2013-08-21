import java.io.*;
class recur_reverse
{
public static void main(String args[])throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter word");
String s=in.readLine();
int l=s.length();
l=l-1;
recur(s,l);
}
public static void recur(String x,int b)
{
if(b>=0)
{
System.out.print(x.charAt(b));
b--;
recur(x,b);
}
}
}

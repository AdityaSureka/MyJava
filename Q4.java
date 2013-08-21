import java.io.*;
public class Q4
{
static String fin="";
public static void main(String args[])throws Exception
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.println();
String t=in.readLine();
st(t,t.length());
}

public static void st(String t,int l)
{
l=l-1;
if(l>=0)
{
fin=fin+t.charAt(l);
st(t,l);
}
else
System.out.println(fin);
}
}

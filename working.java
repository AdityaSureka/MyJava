 /* Link list
  * 
  * by Aditya Sureka
  */import java.io.*;
public class working
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
llist x=new llist();
System.out.println("Enter the no of node");
int n=Integer.parseInt(br.readLine());
for(int i=1;i<=n;i++)
{
x.add_at_end();
}
x.read();
//x.add_at_beg();
x.add_at_pos();
x.read();
}
}
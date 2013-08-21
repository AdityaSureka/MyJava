import java.io.*;
public class encode
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter string");
        String s=in.readLine();
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            int a=(int)ch;
            System.out.print(a);
        }
    }
}
import java.io.*;
class one_a extends two_a
{
    static int a;
    static char b;
    public static void main(String args[]) throws IOException
    {
        BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
        get();
        show();
        getdata();
        showdata();
    }
    public static void getdata()
    {
        a=10;
        b='s';
    }
    public static void showdata()
    {
        System.out.println("One  "+a+" "+b);
    }
}
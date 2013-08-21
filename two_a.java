import java.io.*;
class two_a
{
    static int x;
    static float f;
    public static void main(String args[]) throws IOException
    {
        BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
        one_a x=new one_a();
        x.getdata();
        x.showdata();
        get();
        show();
    }
    public static void get()
    {
        x=5;
        f=7f;
    }
    public static void show()
    {
        System.out.println("Two  "+x+" "+f);
    }
}

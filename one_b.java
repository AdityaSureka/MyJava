import java.io.*;
class one_b extends two_b
{
    public static int a;
    public static char b;
    public static void getdata()
    {
        get();
        a=17;
        b='s';
    }
    public static void showdata()
    {
        show();
        System.out.println("One  "+a+" "+b);
    }
}
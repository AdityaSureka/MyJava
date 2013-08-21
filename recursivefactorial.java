import java.io.*;
class recursivefactorial
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input n");
        int n=Integer.parseInt(stdin.readLine());
        int a=1;
        fact(n,a);
    }
    public static void fact(int x, int b)
    {
        if(x>0)
        {
            b=b*x;
            x--;
            fact(x,b);
        }else{
            System.out.println(+b);
        }
    }
}
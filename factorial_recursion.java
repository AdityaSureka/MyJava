    import java.io.*;
    public class factorial_recursion
    {
        public static void main(String args[])throws IOException
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the number");
            int n=Integer.parseInt(br.readLine());
            double ans=1;
            recur(n,ans);
        }
        public static void recur(int a,double res)
        {
            if(a>0)
            {
                res=res*a;
                a--;
                recur(a,res);
            }
            
            
            if(a==1)
            System.out.println(res);
        }
    }
            
    
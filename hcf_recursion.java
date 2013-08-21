    import java.io.*;
    public class hcf_recursion
    {
        public static void main(String args[])throws IOException
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter the two numbers");
            int a=Integer.parseInt(br.readLine());
            int b=Integer.parseInt(br.readLine());
            int rem=100;
            int ans=0;
            recur(a,b,rem,ans);
        }
        public static void recur(int x,int y,int z,int fnl)
        {
            if(z>=1)
            {
                z=x%y;
                x=y;
                y=z;
                if(z==0)
                {
                    fnl=x;

                }
                if(z!=0)
                recur(x,y,z,fnl);
            }
            if(z==0)
            System.out.println(fnl);
        }
    }
                
      
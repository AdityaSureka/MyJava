    import java.io.*;
    public class power_recursion
    {
        public static void main(String args[])throws IOException
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the base");
            int a=Integer.parseInt(br.readLine());
            System.out.println("Enter the power");
            int b=Integer.parseInt(br.readLine());
            double ans=a;
            recur(a,b,ans);
            
        }
        
        public static void recur(int x,int y,double d)
        {
          
           
            y--;
            if(y>=1)
            {
                d=(d*x);
                recur(x,y,d);
            }
            if(y==0)
            System.out.println(d);
        }
    }
            
         
                

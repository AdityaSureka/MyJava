    import java.io.*;
    public class rev_string_recursion
    {
       public static void main(String args[])throws IOException
       {
           BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
           System.out.println("Enter the string");
           String str=br.readLine();
           int l=str.length();
           int i=l-1;
           recur(str,i);
        }
        public static void recur(String res,int b)
        {
            char ch=' ';
            if(b>=0)
            {
                ch=res.charAt(b);
                b--;
                System.out.print(ch);
                recur(res,b);
            }
        }
    }
                
            
            
    
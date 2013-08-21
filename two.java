    import java.io.*;
    public class two
    {
        public static float f;
        public static int x;
        public static void main(int g)throws IOException
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the values of float and int");
            f=Float.parseFloat(br.readLine());
            x=Integer.parseInt(br.readLine());
            System.out.println(f);
            System.out.println(x);
            one o=new one();
            if(g==0)
            {g++;
            o.main(1);
        }
        }
    }
    
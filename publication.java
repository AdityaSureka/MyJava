    import java.io.*;
    public class publication
    {
        public static String str;
        public static float price;
        public static void mai()throws IOException
        {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));       
        System.out.println("Enter the book title");
        str=br.readLine();
        System.out.println("Enter the price");
        price=Float.parseFloat(br.readLine());
    }
}
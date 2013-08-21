import java.io.*;
public class work_library
{
    public static void main()throws IOException
    {
        Bufferedreader br=new Bufferedreader(new InputStreamreader(System.in));
        String st,str;
        double dd;
        int x;
        System.out.println("name of the book  : ");
        st=br.readLine();
        System.out.println("name of te author : ");
        str=br.readLine();
        System.out.println("price of the book : ");
        dd=Double.parseDouble(br.readline());
        System.out.println("Total number of days : ");
        x=Integer.parseInt(br.raedLine());
    }
}
        
      
    
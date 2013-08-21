import java.io.*;
    public class tape extends publication
    {
        public static float time;
        
        public void getdata()throws IOException 
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the time");
            time=Float.parseFloat(br.readLine());
        }
        public void putdata()
        {
            System.out.println("AUDIO name: "+str);
            System.out.println("price: "+price);
            System.out.println("time: "+time);
        }
    }
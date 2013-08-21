    import java.io.*;
    public class books extends publication
    {
        public  int pg_count;
        
        public void getdata()throws IOException 
        {
            mai();
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the no. of pages");
            pg_count=Integer.parseInt(br.readLine());
        }
        public void putdata()
        {
            System.out.println("book name: "+str);
            System.out.println("price: "+price);
            System.out.println("no.of pages: "+pg_count);
        }
    }
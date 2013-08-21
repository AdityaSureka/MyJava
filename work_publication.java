import java.io.*;
class work_publication
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
        book x=new book();
        tape y=new tape();
        x.getdata();
        y.getdata();
        x.showdata();
        y.showdata();
    }
}
import java.io.*;
public class library
    {
        public String name;
        public String author;
        public double p;
        library()
        {
            
        }
        library(String n,String a,double pr)
        {   
            name=n;
            author=a;
            p=pr;
        
        }
        void show()
        {
            System.out.println("name of the book  : "+name);
            System.out.println("name of te author : "+author);
            System.out.println("price of the book : "+p);
        }
    }
           
            
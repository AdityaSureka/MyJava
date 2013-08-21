import java.io.*;
public class compute extends library
{   
    public int d;
    public int f;
    compute (int da)
    {
        super();
        d=da;
        
    }
    double po=p;
    
    void fine()
    {
        if((d-7)>=1&&(d-7)<=5)
        f=(2*(d-7));
        else if((d-7)>=6&&(d-7)<=10)
        f=(3*(d-7));
        else if((d-7)>10)
        f=(5*(d-7));
    }
    void display()
    {
        System.out.println("Name of the book   : "+name);
        System.out.println("Name of the author : "+author);
        System.out.println("Total number of days : "+d);
        System.out.println("total price :"+po);
        System.out.println("net amt "+((.02*po)+f));
    }
}
        
            
            
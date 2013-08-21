import java.io.*;
class res
{
public static void main()throws IOException
{
point p=new point();
point q=new point();
point r=new point();
p.readpoint();
q.readpoint();
r=r.midpoint(p,q);
r.displaypoint();
}


}
import java.io.*;
class point
{
float x;
float y;
point()
{
x=0;
y=0;
}
void readpoint() throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
x=Float.parseFloat(br.readLine());
y=Float.parseFloat(br.readLine());
}
point midpoint(point a,point b)
{
point c=new point();
c.x=(a.x+b.x)/2;
c.y=(a.y+b.y)/2;
return c;
}
void displaypoint()
{
System.out.println("x=" + x +"y=" +y);
}
}







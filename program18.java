import java.io.*;
class program18
{ 
         
   public void main() throws IOException
   {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("enter type of the triangle 1-equilateral,2-isoceles,3-scalene");
       int ch = Integer.parseInt(br.readLine());
       
       switch(ch)
       {
           case 1:
           {
               System.out.println("enter side");
               int s =Integer.parseInt(br.readLine());
                area(s);
                break;
            }
            case 2:
           {
               System.out.println("enter sides");
               int a =Integer.parseInt(br.readLine());
               int b =Integer.parseInt(br.readLine());
                area(a,b);
                break;
            }
            case 3:
           {
               System.out.println("enter sides");
               int x =Integer.parseInt(br.readLine());
               int y =Integer.parseInt(br.readLine());
               int z =Integer.parseInt(br.readLine());
               area(x,y,z);
               break;
            }
    
        }
    }
    void area(int s)
    {
        double ar=(Math.sqrt(3)/4)*s*s;
        
        System.out.println("AREA OF EQUILATERAL TRIANGLE ="+ar);
    }
    
    void area(int a,int b)
    {
       
        double ar= (.5*a*b);
        
        System.out.println("AREA OF ISOCELES TRIANGLE = "+ar);
    }
    void area(int x,int y,int z)
    {
        float s=(x+y+z)/2;
        double ar= Math.sqrt(s*(s-z)*(s-y)*(s-x));
        
        System.out.println("AREA OF SCALENE TRIANGLE = "+ar);
    }
   
}

   
   
   
  
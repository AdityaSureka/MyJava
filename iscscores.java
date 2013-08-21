import java.io.*;
class iscscores
{
    public static int a[][]=new int[6][2];
    public static int m[]=new int[6];
    public iscscores() throws IOException
    {
        BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
        int i,j;
        System.out.println("Input Marks with codes");
        for(i=0;i<6;i++)
        {
            for(j=0;j<2;j++)
            {
                a[i][j]=Integer.parseInt(stdin.readLine());
            }
        }
        for(i=0;i<6;i++)
        {
            m[i]=point(a[i][0]);
        }
    }
    
    public static int point(int mark)
    {
        int point=0;
        if(mark>=90)
        {
            point=1;
        }
        if(mark>=80 && mark<90)
        {
            point=2;
        }
        if(mark>=70 && mark<80)
        {
            point=3;
        }
        if(mark>=60 && mark<70)
        {
            point=4;
        }
        if(mark>=50 && mark<60)
        {
            point=5;
        }
        if(mark>=40 && mark<50)
        {
            point=6;
        }
        return point;
    }
}
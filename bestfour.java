import java.io.*;
class bestfour extends iscscores
{
    public bestfour() throws IOException
    {
    }
    public static void bestsubjects()
    {
        int i,j;
        for(i=0;i<5;i++)
        {
            for(j=i+1;j<6;j++)
            {
                if(a[i][0]<a[j][0])
                {
                    int t=a[i][0];
                    a[i][0]=a[j][0];
                    a[j][0]=t;
                }
            }
        }
        for(i=0;i<5;i++)
        {
            for(j=i+1;j<6;j++)
            {
                if(m[i]>m[j])
                {
                    int t=m[i];
                    m[i]=m[j];
                    m[j]=t;
                }
            }
        }
    }
    public static void display()
    {
        System.out.println("Best Four Subjects with Codes");
        int i,j;
        for(i=0;i<4;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        int total=0;
        for(i=0;i<4;i++)
        {
            total=total+m[i];
        }
        System.out.println("Total points:"+total);
    }
}
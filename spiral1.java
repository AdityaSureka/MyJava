import java.io.*;
class spiral1
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n,r1,r2,c1,c2,i,j;
        System.out.println("Enter the size of matrix: ");
        n=Integer.parseInt(br.readLine());
        int k=n*n;
        int a[][]=new int[n][n];
        c1=0;
        c2=n-1;
        r1=0;
        r2=n-1;
        do
        {
            for(i=c1;i<=c2;i++)
            {
                a[r1][i]=k;
                k--;
            }
            for(j=r1+1;j<=r2;j++)
            {
                a[j][c2]=k;
                k--;
            }
            for(i=c2-1;i>=c1;i--)
            {
                a[r2][i]=k;
                k--;
            }
            for(j=r2-1;j>=r1+1;j--)
            {
                a[j][c1]=k;
                k--;
            }
            c1++;
            c2--;
            r1++;
            r2--;
        }
        while(k>=1);

        System.out.println("Circular Matrix is");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
                System.out.print(a[i][j]+"\t");

            System.out.println();
        }
    }
}
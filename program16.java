import java.io.*;
    public class program16
    {
      public static void main(String args[])throws IOException
      {   int s;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the nos.");
    int n=Integer.parseInt(br.readLine());
    s=sum(n);
    System.out.println(s);
}
public static int sum(int j)
{ 
int k,sum=0;
for(k=1;k<=j;k++)
sum=sum+k;
return(sum);
}
}

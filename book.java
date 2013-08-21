
import java.io.*;
public class book extends Q6
{
int n;
int page[];
public void getData()throws Exception
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter no. of books");
n=Integer.parseInt(in.readLine());
title=new String[n];
price=new float[n];
page=new int[n];
System.out.println("Enter publication followed by price followed by no. of pages");
for(int i=0;i<n;i++)
{
title[i]=in.readLine();
price[i]=Float.parseFloat(in.readLine());
page[i]=Integer.parseInt(in.readLine());
}
}

public void showData()
{
System.out.println("List of books");
for(int i=0;i<n;i++)
System.out.println(title[i]+"    Rs."+price[i]+"     "+page[i]+"pgs");
}


}


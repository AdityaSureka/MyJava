                                                                                                                                                    import java.io.*;
public class Q92 extends Q9
{
public void bestsubjects()
{

System.out.println("POINTS:");
for(int i=0;i<6;i++)
{
if(number[i][1]>=90)
System.out.println(number[i][1]+"    "+"1");
else if(number[i][1]>=80)
System.out.println(number[i][1]+"    "+"2");
else if(number[i][1]>=70)
System.out.println(number[i][1]+"    "+"3");
else if(number[i][1]>=60)
System.out.println(number[i][1]+"    "+"4");
else if(number[i][1]>=50)
System.out.println(number[i][1]+"    "+"5");
else if(number[i][1]>=40)
System.out.println(number[i][1]+"    "+"6");
else 
System.out.println(number[i][1]+"    "+"7");
}
for(int i=0;i<5;i++)
{
for(int j=i+1;j<6;j++)
{
int t=0;
if(number[i][2]>number[j][2])
{t=number[j][2];
number[j][2]=number[i][2];
number[i][2]=t;
}
}
}
for(int i=0;i<6;i++)
{
for(int j=0;j<2;j++)
System.out.print(number[i][j]+"  ");
System.out.println();
}
}
}

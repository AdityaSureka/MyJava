class demo
{
public void main(int n)
{
int i,j,c;
for(i=1;i<=n;i++)
{
c=0;
for(j=1;j<=i;j++)
{
if(i%j==0)
c++;
}
if(c==2)
System.out.println(i);
}
}
}
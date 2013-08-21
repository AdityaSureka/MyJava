class sum
{
void show(int n)
{
int s=0,d,t=0,c=1;
while(n!=0)
{
d=n%10;
if(c%2==0)
{
s=s+d;
}
else
{
t=t+d;
}
c++;
n=n/10;
}
System.out.println(s);
System.out.println(t);
}
}



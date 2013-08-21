class azm
{
void show(int n, int m)
{
int p=1,c=0,s=0,d,f=1,k=n,t;
while(n!=0)
{
d=n%10;
if(d==m)
f=0;
else
{
s=s+p*d;
p=p*10;
}
n=n/10;
}
if(f==1)
{
n=k;
s=0;
p=1;
while(n!=0)
{
d=n%10;
t=d+m+c;
if(d>9)
{
t=t%10;
c=t/10;
}
s=s+p*t;
p=p*10;

n=n/10;
}
}

System.out.println(s);
}
}

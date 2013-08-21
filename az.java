class az
{
void show( int a)
{
int d,r;
if(a<=256)
{
d=a/26;
r=a%26;
if(d==0)
System.out.print((char)('A' +r-1));
else if(d==1 && r==0)
System.out.print('Z');
else
{
if(r==0)
{
System.out.print((char)('A' +d-2));
System.out.print('Z');
}
else
{
System.out.print((char)('A' +d-1));
System.out.print((char)('A' +r-1));
}

}}
else 
System.out.println("not possible");}}



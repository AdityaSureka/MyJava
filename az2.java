class az2
{
void show(int n)
{
if(n<=256)
{
int e=n/26;
int f=n%26;
String S="";
if(f==0)
{
f=26;
e--;
}
char c=(char)(64+e);
char d=(char)(64+f);

System.out.println(c+""+d);

}
}
}
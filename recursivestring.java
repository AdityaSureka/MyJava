import java.io.*;
class recursivestring
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input String");
        String s=stdin.readLine();
        String s1="";
        int len=s.length();
        reverse(s,s1,len);
    }
    public static void reverse(String str, String str1, int l)
    {
        if(l>0)
        {
            str1=str1+str.charAt(l-1);
            l--;
            reverse(str,str1,l);
        }else{
            System.out.println(str1);
        }
    }
}
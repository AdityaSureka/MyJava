import java.io.*;
import java.util.*;
class decode
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;
        System.out.println("Input the encoded code");
        s=br.readLine();
        String m="";
        int k=0,l=s.length();
        char c;
        for(int i=0;i<l;i++)
        {
            c=s.charAt(i);
            int d=c-48;

            k=k*10+d;
            if(k==32|| (k>=65 && k<=90) || (k>=97 && k<=122))
            {
                m=m+(char)k;
                k=0;
            }
            else if(k>32)
                k=0;
        }
        System.out.println("before changing case  :"+m);
        m=m.toLowerCase();
        String ns=m+" ";
        String fs="";
        String ss="";
        int le=ns.length();
        String sk="";
        int i,a;
        int p=0;
        char ch,ch1,ch2=' ';
        for(i=0;i<le;i++)
        {
            ch=ns.charAt(i);
            if(ch==' ')
            {
                a=i;
                ss=ns.substring(p,a);
                p=a+1;
                int leng=ss.length();
                for(int z=1;z<leng;z++)
                {
                    ch1=ss.charAt(0);
                    if((ch1>='a') && (ch1<='z'))
                    {
                        int ascii=(int)ch1-32;
                        ch2=(char)ascii;
                        fs=fs+ss.charAt(z);
                    }
                    else continue;
                }
                fs=ch2+fs;
                ss="";
                ch1=' ';
                ch2=' ';
                sk=sk+" "+fs;
                fs="";
            }
            else continue;
        }
        System.out.println("after changing case  :"+sk);
    }
}
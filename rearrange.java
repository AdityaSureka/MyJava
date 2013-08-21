import java.io.*;
public class rearrange
{
    String txt;
    String cxt;
    int len;
    rearrange()
    {
        txt="";
        cxt="";
        len=0;
    }
    
    public void readword()throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER STRING IN UPPER CASE");
        txt=in.readLine();
    }
    
    public void convert()
    {
        len=txt.length();
        int a=0;
        int o=0;
        String ss="";
        String st="";
        char c=txt.charAt(0);
        if((c=='A')||(c=='E')||(c=='I')||(c=='O')||(c=='U'))
        {cxt=txt+'Y';
            o=1;
        }
        else
        {
            for(int i=0;i<len;i++)
            {
                char c1=txt.charAt(i);
                 if((c1=='A')||(c1=='E')||(c1=='I')||(c1=='O')||(c1=='U'))
                 {
                     int p=i;
                     ss=txt.substring(a,p);
                     a=p;
                     st=txt.substring(a,len);
                     cxt=st+ss+'C';
                     o=1;
                     break;
                    }
                }
            }
            if(o==0)
            cxt=txt+'N';
        }
        
        public void display()
        {
            System.out.println("ORIGINAL STRING:  "+txt);
            System.out.println("CHANGED STRING:  "+cxt);
        }
    }
        
    
                     
                     
                     
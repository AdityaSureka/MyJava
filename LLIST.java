
import java.io.*;
public class LLIST
{
    public NODE start=new NODE();

    public void add_at_end()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        NODE snode=new NODE();
        NODE tnode=new NODE();
        NODE nnode=new NODE();
        System.out.println("Input new node's data");
        nnode.data=Integer.parseInt(br.readLine());
        snode=start;
        if(snode.link!=null)
        {
            while(snode.link!=null)
            {
                tnode=snode.link;
                snode=tnode;
            }
        }
        snode.link=nnode;
        System.out.println("Work Done");
    }

    public void read()throws IOException
    {
        NODE snode=new NODE();
        NODE tnode=new NODE();
        snode=start;

        while(snode.link!=null)
        {
            tnode=snode.link;
            System.out.println(tnode.data);
            snode=tnode;
        }
        System.out.println("Work Done");
    }

    public void add_at_beg()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        NODE snode=new NODE();
        NODE tnode=new NODE();
        snode=start;
        System.out.println("Enter the data");
        tnode.data=Integer.parseInt(br.readLine());
        tnode.link=snode.link;
        start.link=tnode;
    }

    public void add_at_pos()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        NODE snode=new NODE();
        NODE tnode=new NODE();
        NODE nnode=new NODE();
        snode=start;
        int k=1;
        System.out.println("Enter the position where you want to enter");
        int n=Integer.parseInt(br.readLine());
        while(snode.link!=null)
        {
            tnode=snode.link;
            if(k==n)
            {
                System.out.println("Enter the data");
                nnode.data=Integer.parseInt(br.readLine());
                nnode.link=snode.link;
                snode.link=nnode;
                break;

            }
            snode=tnode;
            k++;
        }
        System.out.println("Work Done");
    }

    public void del_at_pos()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        NODE snode=new NODE();
        NODE tnode=new NODE();
        NODE nnode=new NODE();
        snode=start;
        int k=1;
        System.out.println("Enter the position which you want to delete");
        int n=Integer.parseInt(br.readLine());
        while(snode.link!=null)
        {
            tnode=snode.link;
            if(k==n)
            {
                tnode=snode.link;
                nnode=tnode.link;
                snode.link=nnode;
                break;
            }
            snode=tnode;
            k++;
        }
        System.out.println("Work Done");
    }

    public void search_value()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        NODE snode=new NODE();
        NODE tnode=new NODE();
        snode=start;
        boolean flag=false;
        System.out.println("Enter the data you want to search");
        int search=Integer.parseInt(br.readLine());
        while(snode.link!=null)
        {
            tnode=snode.link;
            if(tnode.data==search)
            {
                flag=true;
                System.out.println("The value is present");
                break;
            }
            snode=tnode;
        }
        if(flag==false)
            System.out.println("The value is not present");
        System.out.println("Work Done");
    }

    public void edit()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        NODE snode=new NODE();
        NODE tnode=new NODE();
        NODE nnode=new NODE();
        snode=start;
        int k=1;
        System.out.println("Enter the position which you want to delete");
        int n=Integer.parseInt(br.readLine());
        while(snode.link!=null)
        {
            tnode=snode.link;
            if(k==n)
            {
                System.out.println("Enter the new value");
                tnode.data=Integer.parseInt(br.readLine());
                break;
            }
            snode=tnode;
            k++;
        }
        System.out.println("Work Done");
    }

    public void sort()throws IOException
    {
        NODE snode=new NODE();
        NODE tnode=new NODE();
        NODE nnode=new NODE();
        snode=start;
        int i=0,j=0;
        int l=0;
        while(snode.link!=null)
        {
            tnode=snode.link;
            snode=tnode;
            l++;
        }
        int k=0;
        snode=start;
        while(i<l-1)
        {
            snode=start;
            tnode=snode.link;
            j=i+1;
            if(tnode.link==null)
                break;
            nnode=tnode.link;
            while(j<l)
            {
                if(tnode.data<nnode.data)
                {
                    k=tnode.data;
                    tnode.data=nnode.data;
                    nnode.data=k;
                }
                tnode=nnode;
                nnode=tnode.link;
                if(tnode.link==null)
                    break;
                j++;
            }
            snode=tnode;  
            i++;
        }           
    }
}


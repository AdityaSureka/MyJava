    import java.io.*;
    public class bubble_sorting_recursion
    {
        static int l;
        public static void main(String args[])throws IOException
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println();
            l=Integer.parseInt(br.readLine());
            int a[]=new int [l];
            System.out.println("enter values");
            init(a,l);
            s1(a,-1);
            for(int i=0;i<l;i++)
            System.out.println(a[i]);
        }
        public static void init(int x[],int m)throws IOException
        {
             BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
             m=m-1;
             if(m>=0)
             {
                 x[m]=Integer.parseInt(br.readLine());
                 init(x,m);
                }
            }
            public static void s1(int a[],int p)
            {
                p=p+1;
                if((p>=0)&&(p<l-2))
                {
                    s2(a,-1);
                    s1(a,p);
                }
            }
            public static void s2(int a[],int q)
            {
                q=q+1;
                if((q>=0)&&(q<(l-1)))
                {
                    if((a[q]>a[q+1]))
                    {
                        a[q]=a[q]+a[q+1];
                        a[q+1]=a[q]-a[q+1];
                        a[q]=a[q]-a[q+1];
                    }
                    s2(a,q);
                }
            }
        }
                
                
            
        
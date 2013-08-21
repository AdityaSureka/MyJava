 
import java.io.*;
public class Working_class
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        LLIST x=new LLIST();
        
        int ch=-1;
        while(ch!=0)
        {
            System.out.print("1.Ad,2.Read,3.Add at beginning,4.Add at position,5.Delete at position,6.Search,7.Edit,8.Sort");
            ch=Integer.parseInt(br.readLine());
            
            switch(ch)
            {
                case 1:            
                System.out.println("Enter the no. of nodes you want to create"); 
                int n=Integer.parseInt(br.readLine());
                for(int i=0;i<n;i++)
                {
                    x.add_at_end();
                }
                break;            
                case 2:
                x.read();
                break;
                case 3:
                x.add_at_beg();
                break;
                case 4:
                x.add_at_pos();
                break;
                case 5:
                x.del_at_pos();
                break;
                case 6:
                x.search_value();
                break;
                case 7:
                x.edit();
                break;
                case 8:
                x.sort();
                break;
                default:
                System.exit(0);
            }
        }
    }
}
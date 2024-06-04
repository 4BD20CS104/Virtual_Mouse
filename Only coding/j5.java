
import java.io.IOException;
import java.util.*;
public class j5 {
 public static void main(String[] args) throws IOException{
    Scanner s =new Scanner(System.in);
    String str = s.next();
    char ch[] = str.toCharArray();
    for(int i = 0;i<ch.length;i++)
    {
        if(ch[i]=='0'||ch[i]=='1'||ch[i]=='2'||ch[i]=='3'||ch[i]=='4'||ch[i]=='5'||ch[i]=='6'||ch[i]=='7'||ch[i]=='8'||ch[i]=='9')
        {
            System.out.print(ch[i]+" ");
        }
    }
    /*for(int i=0;i<str.length();i++)
    {
        if(str.charAt(i)=='0'||str.charAt(i)=='1')
        {
            System.out.println(str.charAt(i));
        }

    }*/


    s.close();
    }
}

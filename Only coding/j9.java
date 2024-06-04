import java.util.*;
import java.io.*;
public class j9{
    static int OperationsBinaryString(String str){
        int sum=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='A')
            {
                sum=(str.charAt(i-1) & str.charAt(i+1))-'0';
            }
            else if(str.charAt(i)=='B')
            {
                sum=(str.charAt(i-1) | str.charAt(i+1))-'0';
            }
            else if(str.charAt(i)=='C')
            {
                sum=(str.charAt(i-1) ^ str.charAt(i+1))-'0';
            }
            else
            {
                continue;
            }
        }
        return sum;
    }
public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int result=OperationsBinaryString(str);
        System.out.println(result);
        sc.close();
}
}          
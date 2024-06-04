import java.util.*;
import java.io.*;
public class j15 {
    public static void main(String[] args){
        int[] arr = new int[10];
        System.out.println(Arrays.toString(arr));
        // String a="123213";
        // System.out.println(Integer.parseInt(a)+1);
        // int b=977657;
        // System.out.println(Integer.toString(b)+"fsf");
        // char c='z';
        // int d=Character.getNumericValue(c);
        // System.out.print(d);
        int b=97;
        System.out.println((char)b);
        String str1="Syed Farhan";
        String str2="Syed's Farhan";
        System.out.println(str1.equals(str2));
        System.out.println(str1==str2);
        System.out.println(str1.compareTo(str2));
        String c[] = str1.split(" ");
        for(String s:c)
        {
            System.out.println(s);
        }
        System.out.println(str1.contains("r"));
        int len=str2.length();
        System.out.println(len);
        String str=str2.replaceAll(str1,str2);
        System.out.println(str);
        String re=str1.substring(4,9);
        System.out.println(re);
        
    }
}

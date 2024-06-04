import java.util.*;
import java.io.*;
public class j14 {
    // static boolean Anagram(char[] arr1,char[] arr2)
    // {
    //     int n=arr1.length;
    //     int m=arr2.length;
        


    // //     char max1=arr1[0];
    // //     for(int i=1;i<n;i++)
    // //     {
    // //         if(arr1[i]>max1)
    // //         {
    // //             max1=arr1[i];
    // //         }
    // //     }
    // //     char max2=arr2[0];
    // //     for(int j=0;j<m;j++)
    // //     {
    // //         if(arr2[j]>max2)
    // //         {
    // //             max2=arr2[j];
    // //         }
    // //     }
    // //     if(max1>max2)
    // //     {
    // //         return true;
    // //     }
    // //     else{
    // //         return false;
    // //     }
    //  }
    public static void main(String[] args){
            Scanner s = new Scanner(System.in);
            String str1=s.nextLine();
            char[] c1=str1.toCharArray();
            String str2=s.nextLine();
            char[] c2=str2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            System.out.println(c1);
            System.out.println(c2);
            // if(Anagram(c1,c2))
            // {
            //     System.out.print("True");
            // }
            // else
            // {
            //     System.out.print("False");
            // }
            s.close();
    }
}

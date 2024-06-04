import java.io.*;
import java.util.*;

public class j24 {
    public static void main(String[] args){
            Scanner s = new Scanner(System.in);
            boolean flag=true;
            System.out.println("Enter the number of array elements: ");
            int n=s.nextInt();
            int[] a = new int[n]; 
            for(int i=0;i<n;i++)
            {
                a[i]=s.nextInt();    
            }
            System.out.println("Enter the number of array elements: ");
            int m=s.nextInt();
            int[] b = new int[m]; 
            for(int i=0;i<m;i++)
            {
                b[i]=s.nextInt();    
            }             
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    if (a[i]==b[j]) {
                        flag=false;
                    }
                }
            }
            if (flag==false) {
                System.out.append("The arrays are not Disjoint");
            }
            else
            {
                System.out.append("The arrays are Disjoint");
            }
            s.close();
    }
}

import java.util.*;
import java.io.*;

public class j22 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of even numbers to be found: ");
        int n=s.nextInt();
        int m=2*n;
        System.out.println("Below are the even numbers for n = "+n + ":");
        for(int i=1;i<=m;i++)
        {
            if (i%2!=0) {
                System.out.print(i+" ");
            }
            else
            {
                System.out.print(i+1+" ");
            }
        }        
        s.close();
    }
}

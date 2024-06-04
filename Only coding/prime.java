import java.util.*;
import java.io.*;

public class prime {
         public static void main(String[] args) {
         System.out.println("Enter the range to find prime numbers!");
         Scanner s = new Scanner(System.in);
         int start = s.nextInt();
         int end = s.nextInt();
        if(start>end){
            System.out.println("Provide the valid input!");
        }
        else{
            for(int i=start;i<=end;i++){
                boolean isprime = true;
                for(int j=2;j*j<=i;j++){
                        if(i%j==0){
                            isprime = false;
                            break;
                        }
                    }
                    if(isprime){
                        System.out.print(i+" ");
                    }
            }
        }
         s.close();
         }
}

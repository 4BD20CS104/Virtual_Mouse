import java.io.*;
import java.util.*;

public class j26 {
         public static void main(String[] args) {
         System.out.println("Magic Number game! ");
         Scanner s = new Scanner(System.in);
         System.out.println("Enter the 3 digit number: ");
         int n = s.nextInt();
         int digit = n%10;
         while(n!=0){
            n = n/10;
            int current_digit = n%10;
            if(current_digit == digit){
                System.out.println("Enter a number with different digits!");
                break;
            }
         }
         System.out.println("Yeah! You are going good.");
         s.close();
         }
}

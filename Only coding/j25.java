import java.util.HashMap;
import java.io.*;

public class j25 {
         public static void main(String[] args) {
         System.out.println("This program is to demonstrate the hashmap function!");
         HashMap<Integer,Character> hash = new HashMap<>();
         hash.put(1, 'a');
         for(int i=2;i<=26;i++)
         {
            for(char c='b';c<='z';c++)
         {
            hash.put(i,c);
         }
        }
            System.out.println(hash);       
         }
}

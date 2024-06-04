import java.util.Scanner;

public class j7 {
 public static void main(String[] args){
        int a[] = new int[20];
        int sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements to add between 1-10");
        int n=s.nextInt();
        System.out.println("Enter the numbers");
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
        }
        System.out.println("Sum of all numbers: "+sum);
        s.close();
 }   
}

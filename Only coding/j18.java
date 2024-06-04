import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;   
public class j18{
    public static void main(String[] args){                      
            Scanner s = new Scanner(System.in);
            int n=s.nextInt();
            Integer[] arr = new Integer[n];
            int arr1[] = new int[n];
            // Integer is a wrapper class and holds many methods and property in it.
            // Use Integer to use Collections in Arrays as just int doesnt work. 
            // Collections are used to reverse the order of numbers i.e., from ascending to descending.   
            System.out.print("Enter the elements: ");
            for(int i =0;i<n;i++)
            {
                arr[i]=s.nextInt();
            }
            Arrays.sort(arr,Collections.reverseOrder());            
            //Arrays.sort(arr);
            System.out.println("Below are the sorted elements:");
            for(int i=0;i<n;i++)
            {
                arr1[i]=arr[i];
                System.out.print(arr[i]+" ");                
            }
            // for(int i=0;i<n;i++)
            // {
            //     for(int j=0;j<n;j++)
            //     {
            //         if(arr1[j]==arr[i])
            //         {
            //             System.out.print("Error");
            //             break;
                        
            //         }
            //         else{
            //             System.out.println("The second largest element is: "+arr[n-2]);
            //         }
            //         System.exit(0);
            //     }
            // }
            
            
    }
}
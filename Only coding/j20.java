import java.util.*;
public class j20 {
    public static void main(String[] args){
        Date d=new Date();
        System.out.println(d);
        Scanner s = new Scanner(System.in);
        System.out.append("Enter the value of n:");
        int n=s.nextInt(); 
        int[] a = new int[n];
        System.out.append("Enter the array elements:");       
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.append("Enter the element to be searched:");
        int k=s.nextInt();
        if (n<0 || n==0) {
            System.out.append("INVALID INPUT");
        }
        for(int i=0;i<n;i++)
        {
            if (n==1) {
                if (k==a[i]) {
                    System.out.append("We found the element at position "+ i);
                }
            }
            else{
                int mid=n/2;
                if(k==a[mid]){
                    System.out.append("found:"+i);
                } 
               }      
        }
        s.close();
        }   
    }


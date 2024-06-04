import java.util.*;
import java.io.*;

public class practice {

    static void shifting(int arr[],int n,int t){
        while(t>n)
        {
            t=t-n;
        }
        int temp[] = new int[n-t];
        for(int i=0;i<n-t;i++)
        {
            temp[i]=arr[i];
        }
        for(int i=n-t;i<n;i++){
            arr[i-n+t]=arr[i];
        }
        for(int i=0;i<n-t;i++){
            arr[i+t]=temp[i];
        }
    }
    static void getmaxmiddle(int[] arr,int n){
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int k=0;
        int l=n-1;
        int mid=(k+l)/2;
        if(arr[mid]==max){
            System.out.print("This is the biggest candy!");
            System.out.println(max);
        }
    }
    static void getminmiddle(int[] arr,int n){
        int min=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        int k=0;
        int l=n-1;
        int mid=(k+l)/2;
        if(arr[mid]==min){
            System.out.println("This is the fuction to find the smallest candy.");
            System.out.println(arr[mid+1]);
        }
        else{
            System.out.println("This is the piece of code to test if candy size is neither big nor small.");
            System.out.println(min);
        }
    }
    public static void main(String[] args) {
         System.out.println("This was the tcs nqt coding question asked in 2024!");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of candies: ");
        int n = s.nextInt();
        System.out.println("Enter the candies sizes in an array: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        System.out.println("Enter the times to shift the array: ");
        int t = s.nextInt();
        shifting(arr,n,t);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+ " ");
        }
        getmaxmiddle(arr,n);
        getminmiddle(arr,n);
        s.close();
         }
}


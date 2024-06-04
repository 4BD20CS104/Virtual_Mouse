import java.io.*;

public class bubblesort {
    static void bublesort(int a[], int k)
    {
        int temp;
        boolean swapped;
        for(int i=0;i<k-1;i++)
        {
            swapped = false;
            for(int j=0;j<k-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    swapped = true;
                }
            }
            if(swapped==false)
                break;
        }
    }
    static void PrintArray(int a[],int k)
    {
        for(int i=0;i<k;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) throws IOException{
         System.out.println("This program illustrates a simple example of bubble sort!");
        int arr[] = {50, 40, 10, 20, 30};
        int n = arr.length;
        bublesort(arr,n);
        System.out.println("Sorted Elements are: ");
        PrintArray(arr,n);
         }
}

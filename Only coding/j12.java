import java.util.*;
public class j12 {
    static void MaxInArray(int a[],int n){
        int max = a[0];
        int j=0;
        if(n<2){
            System.out.println(a);
        }
        else{
            for(int i=0;i<n;i++)
            {
                if(a[i]>max){
                    max=a[i];
                    j=i;
                }
                else{
                    continue;
                }
            }
            System.out.println(max);
            System.out.print(j+1);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[100];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        } 
        MaxInArray(arr,n); 
        sc.close();
    }
}

import java.io.IOException;
import java.util.Scanner;

public class j8 {
    static int[] ProductArray(int ar[],int n)
{
    int[] re = new int[n];
    for(int i=0;i<n;i++)
    {
        int mul=1;
        int a=ar[i];
        for(int j=0;j<n;j++)
        {
            if(ar[j]!=a)
            {
                mul*=ar[j];
            } 
            else{
                continue;
            } 
        }
    re[i]=mul;
    }
    return re;
}
    public static void main(String[] args)throws IOException{
            Scanner s = new Scanner(System.in);
            int n=s.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=s.nextInt();
            }

            int[] result = ProductArray(arr,n);
            for(int i=0;i<n;i++)
            {
            System.out.println(result[i]);
            }
            s.close();
    }
}

import java.io.*;
import java.util.Arrays;
import java.io.*;
public class j16 {
    public static void main(String[] args)throws IOException{
        int[] arr={1,2,3,4,5,6,7,8};
        // arr[3]=7;
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        int index=Arrays.binarySearch(arr,6);
        // prints -1 if found number is less than the number in the index 0 and prints -9 when asked to find number larger from the index at n-1. 
        if(index>=0){
          System.out.println(index+1);
         }
        else 
            System.out.print("Hang on");
    }
}

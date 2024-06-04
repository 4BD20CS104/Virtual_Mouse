
import java.util.Arrays;
public class trisum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		int sum=9;
		Arrays.sort(arr);
		Triplets(arr,sum);
	}
//It can also be as static private void Triplets..
     private static void Triplets(int[] arr, int sum) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++)
		{
			int j=i+1;
			int k=arr.length-1;
			while(j<k)
			{
				int sum2=arr[i]+arr[j]+arr[k];
				if(sum2==sum)
				{
					System.out.println("Triplets are: "+arr[i] +" "+arr[j] +" "+arr[k]);
					j++;
					k--;
				}
				else if(sum2<sum)
					j++;
				else
					k--;
			}
		}
			}
		
	}

import java.util.Scanner;

public class arrsize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("Enter the value of n");
		n=s.nextInt();
		int arr[]=new int[n];
		int size=arr.length;
		System.out.println("The size of array is "+size);
		s.close();
	}

}

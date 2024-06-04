import java.util.Scanner;

public class Sumofnat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		double n=sc.nextInt();
		double Sum=0;
		for(int i=1;i<=n;i++)
		{
			Sum+=i;
		}
		System.out.println("The sum is "+ Sum);
		sc.close();
	}

}

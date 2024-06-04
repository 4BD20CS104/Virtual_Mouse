package codeeatsleep;
import java.util.Scanner;
public class Blind {
	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
	    int i=0,a[],n;
		a=new int[10];
		int b[]=new int[10];
		System.out.println("Enter the size of array:");
		n=s.nextInt();
		System.out.println("Enter the elements of array:");
		while(i<n)
		{
			if(i%2==0) {
			System.out.print("Enter an odd number:");
			a[i]=s.nextInt();
			b[i]=a[i];
			}
			else
			{
				System.out.println("Enter remaining numbers");
				a[i]=s.nextInt();
				b[i]=a[i]+1;
			}
			i++;
		}
		s.close();
		for(i=n;i>0;i--)
		{
			System.out.print(b[i]+" ");
		}
	
	}

}

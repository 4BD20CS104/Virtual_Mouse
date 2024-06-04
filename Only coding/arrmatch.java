import java.util.Scanner;
public class arrmatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		int b[]=new int[5];
		boolean same=true;
		System.out.println("Enter the values in first array");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter the values in second array");
		for(int i=0;i<5;i++)
		{
			b[i]=s.nextInt();
		}
		for(int i=0;i<5;i++)
		{
		if(a[i]==b[i])
		{
		}
		else
			same=false;
		}
		if(same)
			System.out.println("Both arrays are same");
		else
			System.out.println("Both arrays are different");
		s.close();
		}
	}


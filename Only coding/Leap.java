import java.util.Scanner;

public class Leap {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a year:");
		int z=s.nextInt();
		if(!(z%10==0 && z%100==0))
		{
		if(z%4==0)
			System.out.println("Entered number is a leap year.");
		else
			System.out.println("Entered number is not a leap year.");
		s.close();
	}
		else if(z%400==0)
			System.out.println("Entered number is a leap year and a century");
		else 
			System.out.println("Entered number is not a leap year.");
	}
}

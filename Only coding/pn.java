import java.util.Scanner;

public class pn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the number:");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
if(a<0)
	System.out.println("is a negative number.");
else 
	System.out.println("is a positive number");
sc.close();
	}

}

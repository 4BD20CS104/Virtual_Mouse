import java.util.Scanner;

public class alpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the character");
Scanner s = new Scanner(System.in);
char c=s.next().charAt(0);
if(c>65)
	System.out.println("Its a character.");
else if(c<65)
	System.out.println("Its not a character");
else 
	System.out.println("It is a character");
s.close();
	}

}

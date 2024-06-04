import java.io.*;
import java.util.*;

public class p7{
	public static void main(String[] args) {
		System.out.println("Print matrix!");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if (i<j) {
					System.out.print("*"+" ");
				}
				else if (i!=j) {
					System.out.print("^"+" ");
				}
				else{
					System.out.append("#"+" ");
			}
		}
		System.out.println();
		}
		sc.close();
	}
}
package codeeatsleep;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class talent1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int array1[]=new int[20];
		int array2[]=new int[20];
		InputStreamReader in =new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(in);
		System.out.println("Enter the number of elements in array");
		int n=Integer.parseInt(b.readLine());
		System.out.println("Enter the elements for first array");
		for(int i=0;i<n;i++)
		{
		array1[i]=Integer.parseInt(b.readLine());
		}
		System.out.println();
		for(int i=0;i<n;i++)
		{
		array2[i]=Integer.parseInt(b.readLine());
		}
		int min=array1[0];
		for(int i=1;i<n;i++)
		{
		if(array1[i]<min)
		{
			min=array1[i];
		}	
		}
		boolean found=false;
		for(int i=0;i<n;i++)
		{
		if(array1[i]==min)
		{
			for(int j=i+1;j<array1.length;j++)
			{
				if(array1[i]==array1[j])
				{
			found=true;
			//System.out.println(" "+min+" ");
			break;
		}
		}
		if(found)
			break;
	}
		}
		if(found)
			System.out.println(min);
		else
			System.out.println("No such element");
}
}

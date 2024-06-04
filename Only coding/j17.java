import java.util.Scanner; 
public class j17{
    public static void main(String[] args){
            Scanner s = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n=s.nextInt();
            int sum=1;
            for(int i=2;i<n;i++)
            {
                if(n%i==0){
                    sum+=i;
                }
            }
            if(n==sum){
            System.out.print("It is a perfect number because " + sum + "==" + n);
            }
            else{
                System.out.print("It is not a perfect number and the sum we got is " + sum);
            }
    }
}
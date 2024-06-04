import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class j19 {
    public static void main(String[] args) throws Exception{
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the name ");
            String sc =s.next();  
            System.out.println(sc); 
            FileInputStream f=new FileInputStream("p3.c");
            Scanner se=new Scanner(f); 
            System.out.println(se.nextLine());
    }
}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class j3 {
    public static void main(String[] args) throws IOException{
    BufferedReader reader = new BufferedReader(new FileReader("p3.c"));
    for(int i=0;i<=5;i++)
    {
    String str = reader.readLine();
    System.out.println(str);
    }
    reader.close();
    }
}
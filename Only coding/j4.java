import java.io.*;
public class j4 {
    public static void main(String[] args)throws IOException{
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader re = new BufferedReader(r);
        //int s =re.read();//Here ASCII value is read from the user.
        int i=Integer.parseInt(re.readLine());
        //System.out.println(s);//here the integer value is printed for the above ASCII value.
        System.out.println(i);
        re.close();
    }
}
import java.util.Scanner;

public class j10 {
    static boolean CheckPassword(char s[],int r)
    {
        
           if(r<4){
                return false;                
           }
           boolean isdigit=false;
           boolean iscaps=false;
           for(int i=0;i<r;i++)
           {
            char c=s[i];
            if(Character.isDigit(c))
            {
                isdigit=true;
            }
            else if(Character.isUpperCase(c))
            {
                iscaps=true;
            }
            if(c==' '||c=='/')
            {
                return false;
            }
            if(i==0 && Character.isDigit(c)){
                return false;
            }
           } 
           return (isdigit && iscaps)?true:false;
    
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
             
        System.out.println("Enter the password: ");
        String str = sc.nextLine();
        int n = str.length();
        char c[] = str.toCharArray();
       if(CheckPassword(c,n))
       {
        System.out.println("Its a valid password");
       }
       else{
        System.out.println("Its a invalid password");
       }
       sc.close(); 
    }
}

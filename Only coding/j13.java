import java.util.*;

public class j13 {
    static int FrequentCharacterReplaced(char[] s,char r){
            int count=0;
            int max=1;
            for(int i=0;i<s.length;i++)
            {
                char a=s[i];                
                for(int j=i+1;j<s.length;j++)
                {
                    if(s[j]==a){
                        count++;
                    }
                }
                if(count>max)
                {
                   max=count; 
                }
            }
            return max;
    } 
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String str=sc.nextLine();
            char c=sc.next().charAt(0);
            char str1[]=str.toCharArray(); 
            int result=FrequentCharacterReplaced(str1,c);
            System.out.println(result); 
            sc.close();
    }
}

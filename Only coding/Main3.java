public class Main3{
    public static void main(String args[]){
    Solution sol =  new Solution();
    sol.num1 = 23;
    sol.num2 = 37;
    sol.add();
    System.out.println(sol.result);
    }
    }
    class Solution{
    int num1;
    int num2;
    int result;
    public void add() {
    result = num1+num2;
    }
    }

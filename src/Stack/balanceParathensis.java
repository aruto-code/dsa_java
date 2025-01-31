import java.util.ArrayDeque;

public class balanceParathensis {

    public static boolean findMatching(char a , char b){
        if((a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']')){
            return true;
        }
       return false;
    }
    public static boolean findParenthesis(String str) {
        ArrayDeque<Character> s = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            if( x == '(' || x =='{' || x == '['){
                s.push(x);
            }
            else if(s.isEmpty() == true){
                return false;
            }
            else if(findMatching(s.peek(), x) == false){
                return false;
            }
            else{
                s.pop();
            }
        }
        return s.isEmpty();
    }
    public static void main(String args[]){
        String s = "(){}(";
        if(findParenthesis(s) == true){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}

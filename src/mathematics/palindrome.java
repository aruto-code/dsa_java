package mathematics;
import java.util.*;

public class palindrome {

   static boolean palindromeNo(int x){
        int temp = x;
        int num = 0;
        while(temp > 0){
            int r = temp % 10;
            num = num * 10 + r;
            temp = temp/10;
        }
       System.out.println(num);
        if(num == x){
            return true;
        }

        return false;
    }
    public static void main(String args[]){
        boolean res;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no");
        int x = sc.nextInt();
        res = palindromeNo(x);
        if(res == true){
            System.out.println("The no is Palindrome");
        }
        else {
            System.out.println("The no is not Palindrome");

        }

    }
}

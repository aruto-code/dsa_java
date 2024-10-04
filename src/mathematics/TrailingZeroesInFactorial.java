package mathematics;
import java.util.*;
public class TrailingZeroesInFactorial {

    static int trailingZeroesNaive(int x){
        int count = 0;
        int fact = 1;
        for(int i = 2; i <= x; i++){
            fact = fact * i;
        }
        System.out.println("The fact is " + fact);

        while(fact % 10 == 0){
               count ++;
               fact = fact/10;
            }
        return count;
    }

    static int trailingZeroesOptimal(int x){
        int res = 0;
        for(int i = 5; i <= x; i = i * 5){
            res = res + x/i;
        }
        return res;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = sc.nextInt();
        int res1 = trailingZeroesNaive(x);
        System.out.println("The no of trailing zereos using naive approch are " + res1);
        int res2 = trailingZeroesOptimal(x);
        System.out.println("The no of trailing zereos using Optimal approch are " + res2);
    }
}

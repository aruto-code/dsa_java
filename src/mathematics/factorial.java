package mathematics;
import java.util.Scanner;
public class factorial {

    static int factorialNaive(int x){
        int fact = 1;

        for(int i = 2; i <= x; i++){
            fact = fact * i;
        }
        return fact;
    }

    static int factorialRecursion(int x){
        if (x == 0){
                return 1;
         }
        return x * factorialRecursion(x - 1) ;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = sc.nextInt();
        int res1 =  factorialNaive(x);
        System.out.println("The factorial using naive approach is " + res1);
        int res2 =  factorialRecursion(x);
        System.out.println("The factorial using recursion is " + res1);

    }



}

package mathematics;
import java.util.*;
public class ComputingPower {

    static int Naivepower(int x, int n){
        System.out.println("Answer of the naive approch");
        int res = 1;
        for(int i = 0; i < n; i++){
            res  = res * x;
        }
        return res;
    }

    static int recursivePower(int x, int n){
        if(n == 0){
            return 1;
        }
        int temp = recursivePower( x, n/2) ;
        temp = temp * temp;
        if( n % 2 == 0){
            return temp;
        }
        else
            return temp *  x;

    }

    static int iterativePower(int x, int n){
        int res = 1;
        while(n > 0){
            if (n % 2 != 0){
                res = res * x;

            }
            x = x * x;
            n = n/2;
        }
        return res;
    }




public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no");
    int x = sc.nextInt();
    System.out.println("Enter the power");
    int n = sc.nextInt();
   int res =  Naivepower( x,  n);
   int res2 =  recursivePower(x,  n);
   int res3 = iterativePower(x, n);
   System.out.println(res);
    System.out.println("the answer of the recursive solution is " + res2);
    System.out.println("the answer of the iterative solution is " + res3);
}




}

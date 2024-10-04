package mathematics;
import java.util.*;

public class gcd {
    static int GcdNaive(int x, int y){
        int res = Math.min(x,y);
        while(res > 0){
            if(x % res == 0 && y % res == 0){
                break;
            }
            res--;
        }
        return res;
    }

    static int GcdEuclid(int x, int y){
        if(y == 0){
            return x;
        }
        else
            return  GcdEuclid( y, x%y);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1");
        int x = sc.nextInt();
        System.out.println("Enter the number 2");
        int y = sc.nextInt();
        int res = GcdNaive( x, y);
        System.out.println("The GCD of 2 numbers is :" + res);
        int res2 =  GcdEuclid(x, y);
        System.out.println("The GCD of 2 numbers is :" + res2);
    }

}

package mathematics;
import java.util.*;

public class lcm {

    static int gcdNaive(int x, int y){
        int res = Math.max(x, y);
        while(true){
            if(res % x == 0 && res % y == 0){
              return res;
            }
            res++;
        }
    }

    static int gcd(int x, int y){
        if(y == 0){
            return x;
        }
        else{
            return gcd(y, x%y);
        }
    }
    static int gcdEuclid(int x, int y){
        return (x*y)/(gcd(x,y));
    }

    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      int y = sc.nextInt();
      int res2 = gcdNaive(x, y);
      System.out.println(res2);



      int res3 =gcdEuclid(x, y);
        System.out.println(res3);

    }
}

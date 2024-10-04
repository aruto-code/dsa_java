
import java.util.*;
public class checkforPowerof2 {

     static boolean isPow2(int n){
         if (n == 0)
             return false;
         while( n > 1 ){
             if(n % 2 != 0){
                 return false;
             }
             n = n/2;
         }
            return true;
    }

    static boolean optimalispow2(int n ){
         if(n == 0){
             return false;
         }
         else{
             return ((n & (n - 1)) == 0);
         }
    }
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value of n");
            int n = sc.nextInt();
            boolean res1 = isPow2(n);
            System.out.println("naive approch "+ res1);
            boolean res2 = optimalispow2(n);
            System.out.println("optimal approch "+ res2);
    }
}

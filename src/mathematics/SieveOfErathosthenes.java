package mathematics;
import java.util.*;

public class SieveOfErathosthenes {

    static boolean isprimeOp(int x){
        if(x == 1){
            return false;
        }
        if(x == 2 || x == 3){
            return true;
        }
        if(x % 2 == 0 || x% 3 == 0){
            return false;
        }
        for(int i = 5; i * i <= x; i++){
            if(x % i == 0 || x % (i +2) == 0){
                return false;
            }
        }
        return true;
    }

    static void naiveSoE(int n){
        System.out.println("Answer of the naive approch");
        for (int i = 2; i<=n; i++){
            if(isprimeOp(i)){
                System.out.println(i);
            }
        }
    }

    static void optimalSoE(int n){
        System.out.println("answer of the optimal sol");
        boolean[] isPrime = new boolean[n+1];
        for(int i = 1; i <= n; i++){
            isPrime[i] = true;
        }

        for(int i = 2; i * i <= n; i++){
             if(isPrime[i]){
                 for(int j = i * i; j <= n; j = j + i){
                     isPrime[j] = false;
                 }
             }
        }
        for(int i = 2; i <= n; i++){
            if(isPrime[i]){
                System.out.println(i);
            }
        }
    }

    public static void main(String args[]){
        System.out.println("Enter the no");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        naiveSoE(n);
        optimalSoE(n);
    }
}

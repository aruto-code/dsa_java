package mathematics;
import java.util.*;
public class prime {

    static boolean isPrime(int x){
        if(x == 1){
            return true;
        }
        else{
            for(int i = 2; i < x; i++){
                if(x % i == 0){
                    return false;
                }
            }
        }
        return true;

    }

    static boolean isPrimeOptimal(int x){
        if(x == 1){
            return true;
        }
        if(x == 2 || x == 3){
            return true;
        }

        if(x%2 == 0 || x%3 == 0){
            return false;
        }
        for(int i = 5; i * i <= x; i = i + 6){
            if(x%i == 0 || x% (i +2) == 0){
                return false;
            }


        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No");
        int x = sc.nextInt();
        boolean res = isPrime(x);
        if(res == true){
            System.out.println("The No. is Prime");
        }
        else
            System.out.println("The No. is  not Prime");

        boolean resop = isPrimeOptimal(1051);
        if(resop == true){
            System.out.println("The No. is Prime");
        }
        else
            System.out.println("The No. is  not Prime");

    }
}

package mathematics;
import java.util.* ;


public class DivisorOfNumber {

    static void NaiveDon(int x){
        System.out.println("Anwer of the naive approch");
        for(int i = 1; i <=x ; i++){
            if (x % i == 0)
            {
                System.out.println (i);
            }
        }
    }


    static void nonsortedDon(int x){
        System.out.println("Answer of divisor of a given number (Non sorted)");
        for(int i = 1; i * i <= x; i++){
            if(x % i == 0) {
                System.out.println(i);

                if (i != x / i) {

                    System.out.println(x / i);
                }
            }
        }
    }

    static void sortedDON(int x){
        System.out.println("sorted order of divisors");
        int i ;
        for( i = 1; i * i < x; i++){
            if(x % i == 0){
                System.out.println(i);
            }
        for(; i >= 1; i--){
            if (x % i == 0){
                System.out.println(x/i);
            }
        }
        }
    }


public static void main(String args[]){
   System.out.println("Enter the no.");
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    NaiveDon(x);
    nonsortedDon( x);
   sortedDON( x);
    }

}





package mathematics;
import java.util.*;



public class Primefactor {

    static boolean isprimeoptimal(int x){
        if(x == 1){
            return false;
        }
        if(x == 2 || x == 3){
            return true;
        }
        if(x %2 == 0 || x % 3 == 0){
            return false;
        }
        for(int i = 5; i*i <= x; i = i +6){
            if (x % i == 0 || x % (i + 2) == 0){
              return false;
            }
            }
        return true;
        }

    static void Naivepf(int x){
        System.out.println("Answer by Naive Approch");
        for(int i = 0; i < x;i++){
            if(isprimeoptimal(i)){
                int n = i;
                while(x%n == 0){
                    System.out.println(i + "   ");
                    n = n * n;
                }

            }
        }
    }

    static void optimalpf(int x){
        System.out.println("Answer for optimal solution");
        for(int i = 2; i * i <= x;i++){
                while(x%i == 0){
                    System.out.println(i + "   ");
                    x = x/i;
                }

            }
        if(x > 1){
            System.out.println(x);
        }
    }


    static void mostOptimalPf(int n){
        System.out.println("Answer for mst optimal solution");
        if (n <= 1){
            return ;
        }
        while(n%2 == 0){
            System.out.println(2);
            n = n/2;
        }
        while(n%3 == 0){
            System.out.println(3);
            n = n/3;
        }
        for(int i = 5; i * i <= n; i= i+6){
            while(n % i == 0 ){
                System.out.println(i);
                n = n/i;
            }
            while(n % (i+2) == 0 ){
                System.out.println(i+2);
                n = n/(i+2);
            }
        }

    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no ");
        int p = sc.nextInt();
        Naivepf(p);
        optimalpf(p);
        mostOptimalPf(p);
    }
}

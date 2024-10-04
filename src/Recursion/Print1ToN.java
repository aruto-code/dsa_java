import java.util.*;


public class Print1ToN {

    static void print1toN(int n){
        if(n == 0){
            return;

        }
        else{
            print1toN( n -1);
            System.out.println( n + " ");
        }

    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        print1toN(n);


    }
}

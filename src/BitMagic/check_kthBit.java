import java.util.*;

public class check_kthBit {

    static void naiveCheck_kth(int n , int k)
    {
        int x = 1;
        for(int i = 0; i < (k-1); i++){
            x = x * 2;
        }
        if((n & x) != 0) {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

    }
    static void naiveCheck_kth2(int n , int k)
    {
        for(int i = 0; i < (k-1); i++){
            n = n/2;
        }
        if( (n & 1) != 0) {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

    }
    static void efficientCheck_kth(int n , int k)
    {
        int x = (1 << (k - 1));
        if((n & x) != 0){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
    static void efficientCheck_kth2(int n , int k)
    {
        int x = (n >> (k - 1));
        if((x & 1) != 0){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }



    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        System.out.println("enter the value of k ");
        int k = sc.nextInt();
        System.out.print("Answer for naiveCheck_kth " );
        naiveCheck_kth( n ,  k);
        System.out.println();
        System.out.print("Answer for naiveCheck_kth2 ");
        naiveCheck_kth2( n ,  k);
        System.out.println();
        System.out.print("Answer for  efficientCheck_kth ");
        efficientCheck_kth( n , k);
        System.out.println();
        System.out.print("Answer for  efficientCheck_kth2 ");
        efficientCheck_kth2( n , k);


    }

}

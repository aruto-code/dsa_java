import java.util.*;

public class CountSetBit {

    static int tbl[] = new int[256];

    static int countsetNaive(int n){
        int res = 0;
        while(n > 0){

                res = res +( n & 1);
                n = n/2;
            }
        return res;
    }

    static int brainkarningamAlgo(int n){
        int res = 0;
        while(n > 0){

            n = n & (n - 1);
            res = res + 1;
        }
        return res;
    }


    static int lookuptable(int n){
        tbl[0]= 0;
        for(int i = 1; i < 256 ; i++){
            tbl[i] = tbl[ i & (i - 1)] + 1;
        }

      return tbl[n & 255] + tbl[n >> 8 & 255] + tbl[n >> 16 & 255] + tbl[n >> 24];
    }


    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value of n");
            int n = sc.nextInt();
            int res1 =  countsetNaive(n);
            int res2 =   brainkarningamAlgo(n);
            int res3 = lookuptable(n);
            System.out.println("naive approch " + res1);

            System.out.println("Brain kerningam approch " + res2);

            System.out.println("Table lookup method " + res3);

    }
}

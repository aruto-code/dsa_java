package mathematics;

import java.util.*;

public class CountDigit {

   static int countdigit(int x){
        int res = 0;
        while(x > 0){
            x = x / 10;
            res++;
        }
        return res;

    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the digit");
        int x = sc.nextInt();
        int count = countdigit(x);
        System.out.println("The number of digits are : " + count);
    }

}

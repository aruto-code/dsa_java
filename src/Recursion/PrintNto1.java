import java.util.Scanner;

public class PrintNto1 {
    static void printNto1(int n){
        if(n == 0){
            return;

        }
        else{
            System.out.println( n + " ");
            printNto1( n -1);

        }

    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        printNto1(n);


    }
}

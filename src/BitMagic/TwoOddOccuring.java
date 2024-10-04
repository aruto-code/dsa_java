import java.util.Scanner;

public class TwoOddOccuring {


    static int[] twoOddOccuring(int arr[], int n) {
        int x = arr[0];
        int res1 = 0;
        int res2 = 0;
        int temp[] = new int[2];
        for (int i = 1; i < n; i++) {
            x = x ^ arr[i];
        }
        int k = (x & (~(x - 1)));
        for (int i = 0; i < n; i++) {
            if ((arr[i] & k) != 0) {
                temp[0] = temp[0] ^ arr[i];
            } else {
                temp[1] = temp[1] ^ arr[i];
            }
        }

        return temp;
    }

    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int temp1[] = new int[2];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        temp1 = twoOddOccuring(arr, n);
        for(int i =0;i<2; i++){
            System.out.println(temp1[i]);
        }

    }
}

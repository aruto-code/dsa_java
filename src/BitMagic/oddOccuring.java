import java.util.*;

public class oddOccuring {

    static int oddOccur(int arr[], int n){
        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = 0 ; j < n; j++){
                  if(arr[i] == arr[j]){
                        count++;
                  }
            }
            if(count % 2 != 0){
                System.out.println(arr[i]);
                return arr[i];
            }
        }
        return 0 ;
        }


    static int oddOccurOptimal(int arr[], int n){
        int res = 0;
        for(int i = 0 ; i < n ; i++){
            res = res ^ arr[i];
        }
        return res;
    }



    public static void main(String args[]){


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Naive Approch");
        oddOccur( arr, n);
       int res2 = oddOccurOptimal(arr, n);
        System.out.println("Optimal Approch " + res2);



    }
}

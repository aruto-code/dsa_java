//import java.util.*;
//public class solution {
//    // Function to return length of longest subsequence of consecutive integers.
//    public static int longestConsecutive(int[] arr) {
//        if(arr.length == 0 || arr.length == 1){
//            return 0;
//        }
//
//        Arrays.sort(arr);
//        int count = 1;
//        int ResCurr = 0;
//        for(int j = 0; j < arr.length-1; j++){
//            if(arr[j] == arr[j + 1]  - 1){
//                count++;
//            }
//            else{
//                count = 1;
//            }
//            ResCurr = Math.max(ResCurr , count);
//        }
//
//        return ResCurr;
//    }
//
//    public static void main(String[] args) {
//        int arr[] = {1 ,9 ,3 ,10 ,4 ,20, 2};
//        int count = longestConsecutive( arr);
//        System.out.println(count);
//    }
//}

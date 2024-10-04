
import java.util.*;
public class MaxDiff {

    static int maxDiffNaive(int arr[]){
        int res = arr[1] - arr[0];
        int n = arr.length;
        for(int i = 0; i < n- 1; i++){
            for(int j = i+1; j < n  ; j++){

                res = Math.max(res, (arr[j] - arr[i]));
            }
        }
        return res;
    }
    static int maxDiffOptimal(int arr[]){
        int res = arr[1]- arr[0];
        int  minval = arr[0];
        int n = arr.length;
        for(int i = 1; i< n ; i++){
            res = Math.max(res, ( arr[i] - minval));
            minval = Math.min(minval , arr[i]);
        }

     return res;
    }

    public static void main(String args[]){
        int arr[] = {2,3,10,6,4,8,1};
        int res  = maxDiffNaive( arr);
        int res2 = maxDiffOptimal( arr);
        System.out.println(res);
        System.out.println(res2);
    }

}

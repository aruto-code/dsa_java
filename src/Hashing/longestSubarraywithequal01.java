import java.util.HashMap;
import java.util.HashSet;

public class longestSubarraywithequal01 {

    static int naiveLongestSubArray01(int arr[]){
        int res  = 0;
        for(int i = 0; i < arr.length; i++){
            int c0 = 0, c1 = 1;
            for(int j = i; j < arr.length; j++){
                if(arr[j] == 0){
                    c0++;
                }
                if(arr[j] == 1){
                    c1++;
                }
            }
            if(c0 == c1){
                res = Math.max(res,c0+c1);
            }
        }
        return res;
    }
    static boolean is0subarray(int arr[]){
        HashSet<Integer> h = new HashSet<>();
        int pre_sum = 0;
        for(int i = 0; i < arr.length; i++){
            pre_sum += arr[i];
            if (h.contains(pre_sum)) {
                return true;
            }
            if(pre_sum  == 0){
                return true;
            }
            h.add(pre_sum);
        }
        return false;
    }

    static int longestSub(int arr[]){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                arr[i] = -1;
            }
        }
        HashMap<Integer, Integer> h = new HashMap<>();
        int pre_sum = 0;
        int max_length = 0;

        for(int i = 0; i < arr.length; i++){
            pre_sum += arr[i];

            if(pre_sum == 0){
                max_length = i + 1;
            }

            if(h.containsKey(pre_sum)){
                max_length = Math.max(max_length, i - h.get(pre_sum));
            } else {
                // Store the first occurrence of the prefix sum
                h.put(pre_sum, i);
            }
        }

        return max_length;
    }

    public static void main(String args[]){

    }
}

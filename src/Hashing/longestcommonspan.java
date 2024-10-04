import java.util.HashMap;

public class longestcommonspan {

    static int longestCommonSpansamesum(int arr1[], int arr2[]){
        int res = 0;
        int n = arr1.length;
        for(int i = 0 ; i < n; i++){
           int sum1 = 0, sum2 = 0;
           for(int j = i; j < n; j++){
               sum1 = sum1 + arr1[j];
               sum2 = sum2 + arr2[j];
               if(sum1 == sum2){
                   res = Math.max(res, j-i+1);
               }
           }
        }
        return res;
    }

    static int longestCommonSpansameSum(int arr1[], int arr2[]) {
        int n = arr1.length;
        int diff[] = new int[n];

        // Step 1: Create the difference array
        for (int i = 0; i < n; i++) {
            diff[i] = arr1[i] - arr2[i];
        }

        // Step 2: Use a HashMap to find the longest subarray with sum 0
        HashMap<Integer, Integer> h = new HashMap<>();
        int max_len = 0;
        int pre_sum = 0;

        for (int i = 0; i < n; i++) {
            pre_sum += diff[i];

            // If the prefix sum is 0, the subarray from the start to current index has equal sums
            if (pre_sum == 0) {
                max_len = i + 1;
            }

            // If the prefix sum has been seen before, it means the subarray between these indices has a sum of 0
            if (h.containsKey(pre_sum)) {
                max_len = Math.max(max_len, i - h.get(pre_sum));
            } else {
                // Store the first occurrence of the prefix sum
                h.put(pre_sum, i);
            }
        }

        return max_len;
    }
    public static void main(String args[]){
        int arr1[] = {0,1,0,0,0,0};
        int arr2[] = {1,0,1,0,0,1};
        int temp = longestCommonSpansamesum( arr1, arr2);
        System.out.println(temp);
    }
}

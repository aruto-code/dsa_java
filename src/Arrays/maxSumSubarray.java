public class maxSumSubarray {

    static int  maxSumNaive(int arr[]){
        int n = arr.length;
        int res = 0;
        for(int i = 0; i < n; i++){
            int curr = 0;
            for(int j = i; j< n ; j++){
                curr = curr + arr[j];
                res = Math.max(res, curr);
            }
        }

        return res;
    }
    static int maxSumOptimal(int arr[]){
        int n = arr.length;
        int res = arr[0];
        int maxEnding = arr[0];
        for(int i = 1; i < n; i++){
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            res = Math.max(maxEnding , res);
        }
        return res;
    }

    public static void main(String args[]){
        int arr[] ={2,3,-8,7,-1,2,3};
        int res = maxSumNaive( arr);
        int res1= maxSumOptimal( arr);
        System.out.println(res);
        System.out.println(res1);

    }
}

public class maxSumofKelements {

    static int maxsum(int arr[], int k){
        int res = 0;
        int n= arr.length;
        for(int i = 0; i + k - 1 < n; i++){
            int curr = 0;
            for(int j = 0; j < k; j++){
                curr = curr + arr[i + j];
            }
            res = Math.max(res,curr);

        }
        return res;
    }
    static int maxsumoptimal(int arr[], int k){
        int n= arr.length;
        int curr = 0;
        for(int i = 0; i < k ;i++){
             curr = curr + arr[i];
        }
        int res = curr;
        for(int i = k ; i < n;i++){
            curr = curr + arr[i] - arr[i - k];
            res = Math.max(res, curr);
        }

       return res;

}


    public static void main(String args[]){
        int arr[] = {1,8,30,-5,20,7};
        int k = 3;
        int res = maxsum(arr, k);
        int res2 = maxsumoptimal(arr, k);
        System.out.println(res);
        System.out.println(res2);
    }}

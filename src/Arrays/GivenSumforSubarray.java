public class GivenSumforSubarray {

    static boolean isSumNaive(int arr[], int k){
        int n = arr.length;
        int count = 0;
        for(int i = 0 ; i< n; i++){
            int currsum = 0 ;
            for(int j = i; j< n; i++){
                currsum = currsum + arr[j];
                if(k == currsum){
                    return true;
                }
            }
        }
        return false;
    }

    static int issubSum(int arr[], int sum){
        int s = 0, curr = 0;
        int n = arr.length;
        int count = 0;
        for(int i = 0;i < n; i++){
                    curr = curr + arr[i];
        while(sum < curr) {
            curr = curr - arr[s];
            s++;
        }
        if(curr == sum){
            count++;
        }
        }
        return count;
    }
    public static void main(String args[]){
        
        int arr[] = {1,4,20,3,10,5};
        int k = 33;
        boolean res = isSumNaive(arr, k);
        int res2 = issubSum(arr, k);
        System.out.println(res);
        System.out.println(res2);
    }}

public class AllocateminPages {

    static int sum(int arr[], int b, int e){
         int s= 0;
         for(int i = b;i <= e; i++){
            s += arr[i];
         }
            return s;
     }
    static int NaiveminPage(int arr[], int n, int k){
         if(k == 1){
             return sum(arr,0,n-1);
         }
         if(n == 1){
             return arr[0];
         }
         int res = 9999;
         for(int  i = 0 ; i< n ; i++){
             res = Math.min(res, Math.max(NaiveminPage(arr,i,k-1),sum(arr,i,n-1)));
         }
         return res;
     }
    static int minpages(int arr[], int n, int k){
        int sum = 0;
         int mx = 0;
        for(int i = 0; i <n ;i++){
            sum = sum + arr[i];
             mx = Math.max(mx , arr[i]);
         }
        int low  = mx, high = sum, res = 0;
        while(low <=high){
            int mid = (low + high)/2;
            if(isFeasible(arr, k, mid))
            {
                res = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return res;
     }
     static boolean isFeasible(int arr[], int k , int ans){
        int req = 1, sum = 0;
        for(int i = 0 ; i < arr.length ;i++){
            if(sum + arr[i] > ans){
                    req ++;
                    sum = arr[i];
        }
            else{
                sum += arr[i];
            }

        }
        return (req <= k);
     }

     public static void main(String args[])
    {
        int arr[] = {10,5,20};
        int n = arr.length;
        int k = 2;
        int res = NaiveminPage(arr, n, k);
        int res1 = minpages(arr, n,k);
        System.out.println(res);
        System.out.println(res1);

    }
}

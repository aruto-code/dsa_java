public class maxcircularsum {

    static int maxCircularSubarray(int arr[]){
        int res = 0;
        int n = arr.length;
        for(int i = 0; i < n ; i++){
            int curr_sum = arr[i];
            int curr_max= arr[i];
                    for(int j = 1; j < n; j++){
                        int index = (i + j) % n;
                        curr_sum = curr_sum +  arr[index];
                        curr_max = Math.max(curr_max, curr_sum);
                    }
                    res= Math.max(res, curr_max);
            }
        return res;
    }

    static int KadaneAlgo(int arr[]){
        int n = arr.length;
        int res = arr[0];
        int maxEnding = arr[0];
        for(int i = 1; i < n; i++){
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            res = Math.max(maxEnding , res);
        }
        return res;
    }
    static int overallMaxSum(int arr[]){
        int max_normal = KadaneAlgo(arr);
        int n = arr.length;
        if(max_normal < 0){
            return max_normal;
        }
        int arr_sum  = 0;
        for(int i= 0; i <n; i++){
            arr_sum =  arr_sum + arr[i];
            arr[i] = -arr[i];
        }
        int max_circular = arr_sum + KadaneAlgo(arr);
        return Math.max(max_circular, max_normal);


    }
    public static void main(String args[]){
        int arr[] = {5,-2,3,4};
        int res = maxCircularSubarray( arr);
        int res2 = overallMaxSum(arr);
        System.out.println(res);
        System.out.println(res2);

    }
}

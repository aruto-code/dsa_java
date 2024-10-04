public class TrappingRainWater {
    static int TrapWaterNaive(int arr[]){
        int res = 0;
        int n= arr.length;
        for(int i = 0; i < n; i++){
            int lmax = arr[i];
            for(int j = 0; j < i; j++){
                lmax = Math.max(lmax, arr[j]);
            }
            int rmax = arr[i];
            for(int j = i+1; j <n; j++){
                rmax = Math.max(rmax, arr[j]);
            }
            res = res +(Math.min(lmax,rmax) - arr[i]);
        }
        return res;
    }
    static int TrapWaterOptimal(int arr[]){
        int res = 0;
        int n= arr.length;
        int lmax[] = new int[n];
        int rmax[] = new int[n];
        lmax[0] = arr[0];  rmax[n-1] = arr[n-1];
            for(int j = 1; j < n; j++){
                lmax[j] = Math.max(lmax[j - 1], arr[j]);
            }
            for(int j = n-2 ; j >= 0; j--){
                rmax[j] = Math.max(rmax[j + 1], arr[j ]);
            }
            for(int i = 1; i < n; i++){
                res = res +(Math.min(lmax[i],rmax[i]) - arr[i]);
            }

        return res;
    }




    public static void main(String args[]){
        int arr[] = {3,0,1,2,5};
        int res =  TrapWaterNaive( arr);
        int res2 =  TrapWaterOptimal(arr);
        System.out.println(res);
        System.out.println(res2);
    }
}

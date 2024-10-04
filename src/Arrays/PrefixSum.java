public class PrefixSum {

    static int prefixSumNaive(int arr[],int start, int end){
        int sum = 0;
        for(int i = start;  i<= end; i++){
            sum = sum + arr[i];
        }
        return sum;
    }


    static int getSumoptimal(int ps[], int l, int r){
        if(l == 0){
            return ps[r];
        }
        return ps[r] - ps[l -1];
    }
    public static void main(String args[]){
        int arr[] ={2,8,3,9,6,5,4};
        int n = arr.length;
        int ps[] = new int[n];
        ps[0] = arr[0];
        for(int i = 1; i < n; i++){
            ps[i] = arr[i] + ps[i-1];
        }
        int res = prefixSumNaive(arr,0, 4);
        System.out.println(res);
        int res2 = getSumoptimal( ps, 0, 4);
        System.out.println(res2);
    }

}

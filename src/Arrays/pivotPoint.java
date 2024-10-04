public class pivotPoint {
    static int equilibriumPointNaive(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n;i++){
            int ls = 0, rs = 0;
            for(int j = 0; j < i; j++){
                ls = ls + arr[j];
            }
            for(int k = i + 1; k < n; k++){
                rs = rs + arr[k];
            }
            if(ls == rs){
                return arr[i];
            }
        }
        return -1;
    }

    static int eqPointOptimal(int arr[]){
        int rs = 0;
        for(int i = 0; i< arr.length; i++){
            rs = rs + arr[i];
        }
        int ls = 0;
        for(int i = 0; i < arr.length; i++){
            rs = rs - arr[i];
            if(ls == rs){
                return arr[i];
            }
            ls = ls + arr[i];
        }
            return -1;
    }
    public static void main(String args[]){
        int arr[] = {3,4,8,-9,20,6};
        int res = equilibriumPointNaive( arr);
        System.out.println(res);
        int res2 = eqPointOptimal( arr);
        System.out.println(res2);


    }
}

public class MaxLengthEvenOdd {

    static int maxEvenOdd(int arr[]){
        int res = 1;
        int n = arr.length;
        for(int i = 0; i < n ; i++){
                int curr = 1;
            for(int j = i + 1;j< n; j++){
                if(arr[j - 1] % 2 == 0 && arr[j] % 2 != 0 ||
                        arr[j] % 2 == 0 && arr[j-1] % 2 != 0){
                    curr++;
                }
                else {
                    break;
                }

            }
            res = Math.max(res, curr);
        }
        return res;
    }
    static int maxEvenOddOptimal(int arr[]){
        int res = 1;
        int n = arr.length;
        int curr = 1;
        for(int i = 1; i < n ; i++){
                if(arr[i - 1] % 2 == 0 && arr[i] % 2 != 0 ||
                        arr[i] % 2 == 0 && arr[i-1] % 2 != 0){
                    curr++;
                    res = Math.max(res, curr);
                }
                else {
                    curr = 1;
                }
        }
        return res;
    }


    public static void main(String args[]){
        int arr[] = {10, 12, 14, 7, 8};
        int res = maxEvenOdd(arr);
        int res1 = maxEvenOddOptimal(arr);
        System.out.println(res);
        System.out.println(res1);

    }
}

public class LargestNo {

    static int getLargestNaive(int arr[]){
        int n = arr.length;
        for(int i = 0; i <n ; i++){
            boolean flag = true;
            for(int j = 0; j <n; j++){
                if(arr[i] < arr[j]){
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                return i;

            }

        }
        return -1;
    }

    static int getLargestOptimal(int arr[]){
        int res = 0;
        int n = arr.length;
        for(int i = 1 ; i < n ; i++){
            if(arr[i] > arr[res]){
                res = i;
            }
        }
        return res;
    }

    public static void main(String args[]){

            int arr[] = {5,6,8,12,20};
             int res = getLargestNaive( arr);
             System.out.println(res);
        int res2 = getLargestOptimal( arr);
        System.out.println(res2);


    }
}

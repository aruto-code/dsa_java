public class isSorted {

    static boolean isSortedNaive(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i]> arr[j]){
                    return false;
                }
            }

        }
        return true;
    }

    static boolean isSortedOptimal(int arr[]){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            if(arr[i - 1] < arr[i]){
                return false;
            }
        }
       return true;
    }

    public static void main(String args[]){
        int arr[] = {8,11,10,12};
        boolean res = isSortedNaive(arr);
        boolean res2 = isSortedOptimal(arr);
        System.out.println(res);
        System.out.println(res2);


    }

}

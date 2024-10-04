public class tripletSum {

    static boolean optimalsum(int arr[], int x, int si){
        int n = arr.length;
        int i = si;
        int j = n - 1;
        while(i < j){
            if(arr[i] + arr[j] == x){
                return true;
            }
            else if (arr[i] + arr[j] < x){
                i++;
            }
            else{
                j--;
            }
        }
        return false;
    }

    static boolean isTriplet(int arr[],int x){
        int n = arr.length;
        for(int i = 0; i < n - 2;i++){
            for(int j = i + 1; j < n - 1; i++ ){
                for(int k = j + 1 ; k < n ; k++){
                    if(arr[i] + arr[j] + arr[k]  == x){
                        return true;
                    }                }
            }
        }
        return false;
    }


    static boolean Optimalistriplet(int arr[], int x){
            int n = arr.length;
            for(int i = 0;  i< n-2; i++){
                if(optimalsum( arr, x - arr[i], i+1)){
                    return true;
                }
            }
        return false;
    }

public static void main(String args[]){
        int arr[] = {2,3,4,8,9,20,40};
        int x = 32;
    boolean res =  Optimalistriplet(arr, x);
    System.out.println(res);
}
}
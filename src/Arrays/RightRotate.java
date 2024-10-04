public class RightRotate {

    static void reverse(int arr[], int low, int end){
        int n = arr.length;

        while(low < end){
            int temp = arr[end];
            arr[end] = arr[low];
            arr[low] = temp;
            low++;
            end--;
        }
    }

    static void RightRotateBykOptimal(int arr[], int k){
        int n = arr.length;
        k = k % n;
        reverse(arr, 0 , n-1);
        reverse(arr, 0, k - 1);
        reverse(arr , k,n-1);

    }

    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7};
        RightRotateBykOptimal(arr, 3);
        for(int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);

        }
    }
}


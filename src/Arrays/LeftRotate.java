public class LeftRotate {

    static void leftRotateByOne(int arr[]){
        int temp = arr[0];
        int n = arr.length;
        for(int i = 1; i < n; i++){
            arr[i-1] = arr[i];
        }
        arr[n - 1] = temp;
    }

    static void leftRotateByk(int arr[], int k){
        for(int i = 0; i< k; i++){
            leftRotateByOne(arr);
        }
    }
    static void leftRotateBykNaive(int arr[], int k){
        int temp[] = new int[k];
        int n = arr.length;
        for(int i = 0; i < k; i++){
            temp[i] = arr[i];
        }
        for(int i = k; i< arr.length;i++){
            arr[i - k] = arr[i];
        }
        for(int i = 0; i < k; i++){
            arr[n - k + i] = temp[i];
        }
    }

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

    static void leftRotateBykOptimal(int arr[], int k){
        int n = arr.length;
        k = k % n;
            reverse(arr, 0, k - 1);
            reverse(arr , k,n-1);
            reverse(arr, 0 , n-1);
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
        // leftRotateByOne(arr);
      //  leftRotateByk(arr,2);
      //  leftRotateBykNaive(arr, 2);
        leftRotateBykOptimal(arr, 3);
        for(int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);

        }
    }
}

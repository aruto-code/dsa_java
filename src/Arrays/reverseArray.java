public class reverseArray {

    static void reverse(int arr[]){
        int n = arr.length;
        int low = 0;
        int end = n - 1;
        while(low < end){
            int temp = arr[end];
            arr[end] = arr[low];
            arr[low] = temp;
            low++;
            end--;
        }
    }

    public static void main(String args[]){
        int arr[] = {2,4,5,9,6};
         reverse(arr);
        for(int i = 0; i < 5;i++){
            System.out.println(arr[i] + " ");
        }
    }

}

public class countingSort {

     static void naiveCountSort(int arr[], int k){
         int count[] = new int[k];
         int n = arr.length;
         for(int i = 0 ;i < n;i++){
             count[arr[i]]++;
         }
         int index = 0;
         for(int i = 0 ; i < n;i++){
             for(int j = 0; j < count[i];j++){
                 arr[index] = i;
                 index++;
             }
         }
     }
     static void optimalCountingSort(int arr[], int k){
         int count[] = new int[k];
         int n = arr.length;
         for(int i = 0 ;i < n;i++){
             count[arr[i]]++;
         }
         for(int i = 1; i < k; i++){
             count[i] = count[i] + count[i-1];
         }
         int output[] = new int[n];
         for(int i = n-1; i>= 0; i--){
             output[count[arr[i]] - 1] = arr[i];
             count[arr[i]]--;
         }
         for(int i = 0; i < n; i++){
           arr[i] = output[i];
         }

     }

    public static void main(String args[]){
        int arr[] = {3,4,4,6,1,2,9};
        int k = 10;
        //naiveCountSort(arr, k);
        optimalCountingSort(arr,k);
        for(int i = 0 ;i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}

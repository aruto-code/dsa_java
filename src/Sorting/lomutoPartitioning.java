public class lomutoPartitioning {

    static  int lparitioning(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low - 1;
        for(int j = low ; j < high ; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return (i+1);
    }

    public static void main(String args[]){
        int arr[] = {10,80,30,90,40,50,70};
        int low = 0;
        int high = arr.length-1;
        int res = lparitioning( arr, low, high);
        System.out.println(res);

    }
}

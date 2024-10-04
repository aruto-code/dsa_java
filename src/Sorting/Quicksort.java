public class Quicksort {
    static int hoarepartioning(int arr[], int l , int h){
        int pivot = arr[l];
        int i = l - 1;
        int j =  h+1;
        while(true) {
            do {
                i++;
            } while (arr[i] < pivot);
            do {
                j--;
            } while (arr[j] > pivot);
            if (i >= j) {
                return j;
            }

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    static void quicksort(int arr[], int l, int h){
        if(l < h){
            int p =  hoarepartioning(arr, l , h);
            quicksort(arr, l, p);
            quicksort(arr, p+1, h);
        }
    }
    public static void main(String args[]){
        int arr[] = {4,1,3,9,7};
        int l = 0;
        int h = arr.length  -1 ;
        quicksort(arr, l,h);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}

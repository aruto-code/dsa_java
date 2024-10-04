public class MergeSort {

    static void merge(int arr[], int l, int m, int h){
        int n1 = m - l + 1;
        int n2 = h - m;
        int left[] = new int[n1];
        int right[] = new int[n2];
        for(int i = 0; i < n1; i++){
            left[i] = arr[i + l];
        }
        for(int i = 0; i < n2; i++){
            right[i] = arr[i + m + 1];
        }
        int i = 0,  j = 0, k = l;
        while(i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                k++;
                i++;
            } else {
                arr[k] = right[j];
                k++;
                j++;
            }
        }
        while(i < n1){
            arr[k] = left[i];
            i++;
            k++;
        }
            while(j < n2){
                arr[k] = right[j];
                k++;
                j++;
            }
    }


    static void MergeSort(int arr[], int l , int r){
        if(l < r){
            int m =  ((l + r)/2);
            MergeSort(arr, l ,m);
            MergeSort(arr, m+1, r);
            merge(arr, l, m, r);
        }
    }
    public static void main(String args[]){
        int arr[]= {12 , 76 ,34 ,12 , 90, 3, 2, 1,78};
        int l = 0;
        int r= (arr.length)-1;

        MergeSort(arr, l ,r);
        for(int i = 0; i< arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
}

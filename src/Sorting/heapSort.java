public class heapSort {
    static void heapify(int arr[],int n, int i) {
        int largest = i, left = (2 * i )+ 1, right = (2 * i) + 2;
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != i) {
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
            heapify(arr, n, largest);
        }
    }

    static void buildHeap(int arr[]){
        int n = arr.length;
        for(int i = (n-2)/2 ; i>= 0; i--) {
            heapify(arr,n, i);
        }
        }
    static void heapsort(int arr[]){
        int n = arr.length;
        buildHeap(arr);
        for(int i = n-1; i >= 1; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }

    }

    public static void main(String[] args) {
        int arr[] = {10,10,4,2,67,43};
        heapsort(arr);
        for(int i = 0; i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

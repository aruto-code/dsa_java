public class sort3typeArray {

    static void sort(int arr[]) {
        int n = arr.length;
        int temp[] = new int[n];
        int i = 0;
        for (int j = 0; j < n; j++) {
            if (arr[j] == 0) {
                temp[i] = arr[j];
            }
        }
        for (int j = 0; j < n; j++) {
            if (arr[j] == 1) {
                temp[i] = arr[j];
            }
        }
        for (int j = 0; j < n; j++) {
            if (arr[j] == 2) {
                temp[i] = arr[j];
            }
        }
        for (int j = 0; j < n; j++) {
            arr[j] = temp[j];
        }
    }

    static void detchNationalflag(int arr[]){
        int n = arr.length;
        int ls = 0, mid = 0, hi = n-1;
        while(mid <= hi){
            if(arr[mid] == 0){
                int temp = arr[ls];
                arr[ls] = arr[mid];
                arr[mid] = temp;
                mid++;
                ls++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                int temp = arr[hi];
                arr[hi] = arr[mid];
                arr[mid] = temp;
                hi--;
            }
        }
    }

    public static void main(String args[]){
        int arr[] = {10,5,6,3,2,40};
        sort( arr);
    }
}

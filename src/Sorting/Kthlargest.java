public class Kthlargest {

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

    static int kthlargest(int arr[], int k){
        int n = arr.length;
        int x = n - k;
        int l = 0 ; int h = arr.length-1;
        while(l <= h){
            int p = lparitioning( arr, l, h);
            if(p  == x){
                return arr[p];
            }
            else if (p > x){
                h = p - 1;
            }
            else {
                l = p +1;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int arr[] = {10,4,5,8,11,6,26};
        int k = 5;
        int res = kthlargest(arr, k);
        System.out.println(res);
    }
}

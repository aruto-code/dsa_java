public class radixSort {
    static void optimalCountingSort(int arr[], int k) {
        int count[] = new int[10];
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            count[(arr[i] / k) % 10]++;
        }
        for (int i = 1; i < 10; i++) {
            count[i] = count[i] + count[i - 1];
        }
        int output[] = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / k) % 10] - 1] = arr[i];
            count[(arr[i] / k) % 10]--;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }

    }

    static void funradixSort(int arr[]) {
        int mx = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        for (int exp = 1; mx / exp > 0; exp = exp * 10) {
            optimalCountingSort(arr, exp);
        }
    }

    public static void main(String args[]) {
        int arr[] = {319, 212, 8, 6, 50};
        funradixSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

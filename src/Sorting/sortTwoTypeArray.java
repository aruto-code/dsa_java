

public class sortTwoTypeArray {

    static void niaveSegragate(int arr[]){
        int n = arr.length;
        int temp[] = new int[n];
        int i = 0;
        for(int j = 0 ; j < n ; j++){
            if(arr[j] < 0){
                temp[i] = arr[j];
                i++;
            }
        }
        for(int j = 0 ; j < n ; j++){
            if(arr[j] >= 0){
                temp[i] = arr[j];
                i++;
            }
        }
        for(int j = 0; j < n; j++){
            arr[j] = temp[j];
        }
        for(int j = 0; j < n; j++){
            System.out.println(arr[j]);
        }
    }

    static void optimalSegregate(int arr[]){
        int n = arr.length;
        int i = -1, j = n;
        while(true) {
            do {
                i++;
            } while (arr[i] < 0);
            do {
                j--;
            } while (arr[j] > 0);
            if (i >= j) {
                break;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for(int u = 0; u < n; u++){
            System.out.println(arr[u]);
        }
    }
    public static void main(String args[]){
        int arr[] = {15, 7,8};
        niaveSegragate( arr);
        optimalSegregate( arr);
    }
}

public class Bubblesort {

    static void bubblesort(int arr[]){
        int n = arr.length;
        boolean flag = false;
        for(int i = 0; i < n - 1;i++){
            for(int j = 0 ; j < n-i-1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(flag == false){
                break;
            }
        }
        for(int i = 0; i < n ; i++){
            System.out.println(arr[i]);
        }

    }

    public static void main(String args[]){
        int arr[] = {23, 56,12 ,54,34,67};
        bubblesort(arr);
    }
}

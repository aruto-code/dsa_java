public class TwoPointerApproch {

    static boolean Naivetwosum(int arr[], int x){
        int n = arr.length;
        for(int i = 0; i < n -1; i++){
            for(int j = i+1 ; j < n ; j++)
            if(arr[i] + arr[j] == x)
            {
                return true;
            }
        }
        return false;
    }

    static boolean optimalsum(int arr[], int x){
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while(i < j){
            if(arr[i] + arr[j] == x){
                return true;
            }
            else if (arr[i] + arr[j] < x){
                i++;
            }
            else{
                j--;
            }
        }
        return false;
    }

    public static void main(String args[]){
        int arr[] = {2,5,8,12,30};
        int x = 17;
        boolean res = Naivetwosum( arr,x);
        System.out.println(res);
        boolean res2 = optimalsum(arr, x);
        System.out.println(res2);
    }
}

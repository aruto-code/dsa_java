public class firstOccur {

    static int firstOccurNaive(int arr[], int x){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return - 1;
    }

    static int firstOccurIterative(int arr[], int x){
        int n = arr.length;
        int low = 0, high = n-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] > x){
                high = mid  - 1;
            }
            else if (arr[mid] < x){
                low = mid + 1;
            }
            else{
                if(mid == 0 || arr[mid] != arr[mid -1 ]){
                    return mid;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        return -1 ;
    }

    static int firstOccurRecur(int arr[], int low, int high, int x){
        if(low > high){
            return -1;
        }
        int mid = (low + high)/2;
        if(arr[mid] > x){
           return firstOccurRecur(arr, low, mid - 1,  x);
        }
        else if (arr[mid] < x){
           return firstOccurRecur(arr, mid + 1, high,  x);
        }
        else{
            if(mid == 0 || arr[mid] != arr[mid - 1]){
                return mid;
            }
            else{
                return firstOccurRecur(arr, low, mid - 1,  x);
            }

        }
    }

    public static void main(String args[]){
        int arr[] = {10,10,10,20,20,20,30};
        int x = 20;
        int res = firstOccurNaive(arr, x);
        System.out.println(res);
        int res2= firstOccurIterative(arr, x);
        int res3 = firstOccurRecur( arr, 0, 6,  x);
        System.out.println(res2);
        System.out.println(res3);
    }
}

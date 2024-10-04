public class lastOccur {


    static int lastOccurIterative(int arr[], int x){
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
                if(mid == n -1  || arr[mid] != arr[mid + 1 ]){
                    return mid;
                }
                else{
                    low = mid + 1;
                }
            }
        }
        return -1 ;
    }

    static int lastOccurRecur(int arr[], int low, int high, int x){
        int n = arr.length;
        if(low > high){
            return -1;
        }
        int mid = (low + high)/2;
        if(arr[mid] > x){
            return lastOccurRecur(arr, low, mid - 1,  x);
        }
        else if (arr[mid] < x){
            return lastOccurRecur(arr, mid + 1, high,  x);
        }
        else{
            if(mid == n-1 || arr[mid] != arr[mid + 1]){
                return mid;
            }
            else{
                return lastOccurRecur(arr, mid + 1, high,  x);
            }

        }
    }

    public static void main(String args[]){
        int arr[] = {10,10,10,20,20,20,30};
        int x = 20;
        int res2= lastOccurIterative(arr, x);
        int res3 = lastOccurRecur( arr, 0, 6,  x);
        System.out.println(res2);
        System.out.println(res3);
    }
}

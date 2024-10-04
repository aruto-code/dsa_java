public class countOccur {

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
    static int countOccur(int arr[], int x){
        int first = firstOccurIterative( arr, x);
        if(first == -1){
            return 0;
        }
        else{
            return (lastOccurIterative(arr,x) - (first) + 1);
        }
    }

    public static void main(String args[]){
        int arr[] = { 10 ,20 ,20 ,20, 30, 30};
        int x = 20;
       int res =  countOccur(arr, x);
        System.out.println(res);
    }
}

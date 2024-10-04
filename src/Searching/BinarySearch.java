public class BinarySearch {

    static int bsearchIterative(int arr[],int x){
        int n = arr.length;
        int low = 0, high = n - 1;
        while(low <= high){
           int mid = (low + high)/2;
           if(arr[mid] == x){
              return mid;
           }
           else if (arr[mid] > x){
               high = mid - 1;
           }
           else{
               low = mid + 1;
           }
        }
        return -1;
    }

    static int bsearchRecursive(int arr[],int low , int high, int x){

        if(low > high){
            return -1;
        }
        int mid = (low + high)/2;
        if(arr[mid] == x){
            return mid;
        }
        else if(arr[mid] > x){
          return bsearchRecursive( arr, low, mid - 1, x);
        }
        else
            return bsearchRecursive( arr, mid + 1, high, x);
    }

    public static void main(String args[]){
        int arr[] = {10,20,30,40,50};
        int x = 20;
        int res = bsearchIterative(arr,x);
        System.out.println(res);
        int res2 = bsearchRecursive( arr, 0 , 4 , x);
        System.out.println(res2);
    }
}

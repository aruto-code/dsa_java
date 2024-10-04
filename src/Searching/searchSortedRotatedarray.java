public class searchSortedRotatedarray {

    static int Naivesearch(int arr[],int x){
      int n = arr.length;
        for(int i = 0; i< n; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }

    static int Optimalsearch(int arr[], int x){
        int n = arr.length;
        int low = 0, high = n - 1;
        while(low <=high){
            int mid = (low + high)/2;
            if(arr[mid] == x){
                return mid;
            }
            if(arr[low] < arr[mid]){
                if(x >= arr[low] && x < arr[mid]){
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }
            else{
                if(x > arr[mid] && x < arr[high]){
                    low = mid + 1;
                }
                else{
                    high = mid -1;
                }
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int arr[] = {100,200,300,10,20};
        int x = 30;
        int res1 =  Naivesearch( arr, x);
        System.out.println(res1);
        int res2 = Optimalsearch(arr, x);
        System.out.println(res2);


    }
}

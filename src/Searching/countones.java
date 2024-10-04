public class countones {

    static int countoccur(int arr[]){
        int n = arr.length;
        int low = 0, high = n-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == 0){
                low = mid + 1;
            }
            else{
                if(mid == 0 || arr[mid] != arr[mid-1]){
                    return (n - mid);
                }
                else{
                    high = mid - 1  ;
                }
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int arr[] = {0,0,0,1,1,1,1};
        int res = countoccur(arr);
        System.out.println(res);

    }
}

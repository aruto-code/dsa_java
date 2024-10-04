public class SearchInfiniteSortedarray {

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


    public static int Naivesearch(int arr[], int x){
        int i  = 0;
        while(true){
            if(arr[i] == x){
                return i ;
            }
            if(arr[i] > x){
                return -1;
            }
        }
    }

    public static int OptimalSearch(int arr[],int x){
        if(arr[0] == x)
            return 0;
        int i = 1;
        while(arr[i] < x){
            i = i * 2;

        }
        if(arr[i] == x){
            return i;
        }
        return bsearchRecursive(arr, i/2 + 1,i - 1 ,x);
    }




    public static void main(String args[]){

        int arr[] = {1,10,15,20,40,80,90,100};
        int x = 100;
        int res2 = Naivesearch( arr, x);
        int res1 = OptimalSearch(arr, x);
        System.out.println(res1);
        System.out.println(res2);

    }
}

public class removeDuplicate {

    static void removedupNiave(int arr[]){
        int n = arr.length;
        int temp[] = new int[n];
        int res = 1;
        temp[0] = arr[0];
        for(int i = 1; i < n; i++)
        {
                if(temp[res - 1] != arr[i]){
                    temp[res] = arr[i];
                    res++;
                }
        }

        for(int i = 0 ; i < res; i++){
            System.out.println(temp[i]);
        }

    }
    static int removeDupOptimal(int arr[]){
        int res = 1;
        for(int  i = 0 ; i < arr.length ;i++){
            if(arr[res - 1] != arr[i]){
                arr[res] = arr[i];
                res++;

            }
        }
        return res;

    }

    public static void main(String args[]){
        int arr[] = {10,10,10};
        removedupNiave(arr);

    }
}

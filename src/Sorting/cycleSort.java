public class cycleSort {
    static void cycleSortDistinct(int arr[]){
        int n = arr.length;
        for(int cs = 0; cs < n-1; cs++){
            int item = arr[cs];
            int pos = cs;
            for(int j = cs + 1; j < n ; j++) {
                if (item > arr[j]) {
                    pos++;
                }
            }
                int temp = arr[pos];
                arr[pos] = item;
                item = temp;

        while(pos != cs){
            pos = cs;
            for(int j = cs + 1 ; j < n; j++){
                if(arr[j]< item){
                    pos++;
                }
            }
            int x = arr[pos];
            arr[pos] = item;
            item = x;
        }
        }
        for(int i = 0 ; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[]){
        int arr[] = {20,40,50,10,30};
        cycleSortDistinct( arr);

    }
}

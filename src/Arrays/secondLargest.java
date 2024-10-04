public class secondLargest {

    static int getLargestOptimal(int arr[]){
        int res = 0;
        int n = arr.length;
        for(int i = 1 ; i < n ; i++){
            if(arr[i] > arr[res]){
                res = i;
            }
        }
        return res;
    }


    static int SecondLargest(int arr[]){
        int n = arr.length;
        int largest =  getLargestOptimal( arr);
        int res = -1;
        for(int i = 0; i< n; i++){
            if(arr[i] != arr[largest]){
                if(res == -1){
                    res = i;
                }
                else if (arr[i] > arr[res]){
                    res = i;
                }
            }
        }
            return res;
        }

        static int secondlargestoptimal(int arr[]){
        int n = arr.length;
        int res = -1;
        int largest = 0;
        for(int i = 1; i < n; i++){
            if(arr[i] > arr[largest]){
                res = largest;
                largest = i;
        }
            else if(arr[i] != arr[largest]){
                if(res == -1 || arr[i] > arr[res] ){
                    res = i;
                }
            }

            }
            return res;
        }

        public static void main(String args[]) {
            int arr[] = {20 , 10 ,10};
            int temp = SecondLargest( arr);
            System.out.println(temp);
            int temp2 = secondlargestoptimal( arr);
            System.out.println(temp2);

    }
}

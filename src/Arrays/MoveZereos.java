public class MoveZereos {

    static void moveToendNaive(int arr[]){
        for(int i = 0; i< arr.length; i++){
            if(arr[i] == 0){
                for(int j = i+1; j < arr.length; j++){
                        if( arr[j] != 0){
                            int temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                        }
                }

            }

        }
    }
    static void moveToEndOptimal(int arr[]){
        int count = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }

    public static void main(String args[]){
        int arr[] = {1,2,0,0,0,6,3,2};
       // moveToendNaive(arr);
        moveToEndOptimal(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);

        }

    }
}

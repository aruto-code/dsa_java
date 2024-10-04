import java.util.HashSet;

public class pairWithGivemSum {

    static boolean isPair(int arr[], int sum){
        for(int i = 0 ; i < arr.length; i++){
            for(int j = i +1; j < arr.length; j++){
                if(arr[i] + arr[j] == sum){
                    return true;
                }
            }
        }
        return false;
    }

    static boolean isPairOptimal(int arr[],int sum){
        HashSet<Integer> h = new HashSet<>();
        for(int i : arr){
            if(h.contains(sum - i)){
                return true;
            }
            else{
                h.add(i);
            }
        }
        return false;
    }

    public static void main(String args[]){
        int arr[] = {8,3,4,2,5};
        int sum = 6;
        boolean temp = isPair( arr,sum);
        boolean temp2 = isPairOptimal( arr,sum);
        System.out.println(temp);
        System.out.println(temp2);

    }
}

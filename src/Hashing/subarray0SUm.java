import java.util.HashSet;

public class subarray0SUm {

    static boolean is0subarray(int arr[]){
        HashSet<Integer> h = new HashSet<>();
        int pre_sum = 0;
        for(int i = 0; i < arr.length; i++){
            pre_sum += arr[i];
            if (h.contains(pre_sum)) {
                return true;
            }
            if(pre_sum  == 0){
                return true;
            }
            h.add(pre_sum);
        }
        return false;
    }
    public static void main(String args[]){
        int arr[] = {-1,4,-3,5,1};
        boolean temp = is0subarray(arr);
        System.out.println(temp);
    }
}

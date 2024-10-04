import java.util.Arrays;
import java.util.HashSet;

public class longestConsecutiveSubsequence {

    static int naiveLongestSub(int arr[]){
        Arrays.sort(arr);
        int res = 1, curr = 1;
        for(int i = 1; i < arr.length;i++){
            if(arr[i] == arr[i-1] + 1){
                curr++;
            }
            else if(arr[i] != arr[i-1]){
                res = Math.max(res, curr);
                curr = 1;
            }
        }
        return Math.max(res, curr);
    }

    static int optimalLongestSub(int arr[]){
        HashSet<Integer> h = new HashSet<>();
        for(int x: arr){
            h.add(x);
        }
        int res = 1;
        for(Integer x:h){
            if(h.contains(x-1) == false){
                int curr = 1;
                while(h.contains(x+curr)){
                    curr++;
                    res = Math.max(res,curr);
                }
            }
        }
        return res;
    }

    public static void main(String args[]){
        int arr[] = {2,9,4,3,10};
        int temp = naiveLongestSub(arr);
        int temp2 = optimalLongestSub(arr);
        System.out.println(temp);
        System.out.println(temp2);
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MorethanNByKOccurances{

    static void printnByk(int arr[], int k){
        Arrays.sort(arr);
        ArrayList<Integer> lst = new ArrayList<>();
        int n = arr.length;
        int i = 1, count = 1;
        while(i < n){
            while(i < n && arr[i] == arr[i-1]){
                count++;
                i++;
            }
            if(count > n/k){
                lst.add(arr[i-1]);
            }
            count = 1;
            i++;
        }
        System.out.println(lst);
    }

    static void optimalPrintNByk(int arr[], int k) {
        int n = arr.length;
        HashMap<Integer, Integer> h  = new HashMap<>();
        ArrayList<Integer> lst = new ArrayList<>();
        for(int x: arr){
            h.put(x,h.getOrDefault(x,0)+1);
        }
        for(Map.Entry<Integer, Integer> e: h.entrySet()){
            if(e.getValue() > n/k){
                lst.add(e.getKey());
            }
        }
        System.out.println(lst);
    }

    public static void main(String args[]){
    int arr[] = {30,10,20,20,10,20,30,30};
    int k  = 4;
    printnByk( arr, k);
    optimalPrintNByk(arr,k);
    }
}

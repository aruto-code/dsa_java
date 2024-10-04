import java.util.HashMap;

public class countDistinctElementsinWindow {

    static void printDistinctElements(int arr[], int k){
        for(int i = 0; i <= arr.length - k; i++){
            int count = 0;
            for(int j = 0 ; j < k; j++){
                boolean flag = false;
                for(int p = 0; p < j; p++){
                    if(arr[i + j] == arr[i + p]){
                        flag = true;
                        break;
                    }
                }
                if(flag == false){
                    count++;
                }
            }
            System.out.print(count + " ");
        }
    }

    static void optimalPrintDistinctElements(int arr[], int k){
        int n = arr.length;
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i = 0; i < k;i++){
            h.put(arr[i],h.getOrDefault(arr[i],0)+1);
        }
        System.out.println(h.size()+ " ");
        for(int i = k; i < n; i++){
            int elementToRemove = arr[i - k];
            h.put(elementToRemove, h.get(elementToRemove) - 1);
            if (h.get(elementToRemove) == 0) {
                h.remove(elementToRemove);
            }
            if(h.containsKey(arr[i])){
                h.put(arr[i], h.get(arr[i]) + 1);
            }
            else{
                h.put(arr[i], 1);
            }
            System.out.print(h.size()+ " ");
        }
    }
    public static void main(String args[]){
        int k = 4;
        int arr[] = {10,20,20,10,30,40,10};
        printDistinctElements( arr, k);
        optimalPrintDistinctElements(arr, k);
    }
}

import java.util.HashSet;

public class CountDistinctElements {

    static int naiveCountElements(int arr[]){
        int res = 0;
        for(int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i]) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                res++;
            }
        }
         return res;
    }
    static int countDistinctElements(int arr[]){
        int res = 0;
        HashSet<Integer> h = new HashSet<Integer>();
        for(int i = 0; i < arr.length; i++){
            h.add(arr[i]);
        }
       return h.size();
    }

    public static void main(String args[]){
        int arr[] = {3,5,4,4,2,1,3};
        int x = naiveCountElements(arr);
        int temp = countDistinctElements(arr);
        System.out.println(x);
        System.out.println(temp);
    }
}

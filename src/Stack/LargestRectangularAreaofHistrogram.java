import java.util.Stack;

public class LargestRectangularAreaofHistrogram {

    public static int findLargestRectangularArea(int arr[], int n) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            int curr = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] >= arr[i]) {
                    curr = curr + arr[i];
                } else {
                    break;
                }
            }
            for (int j = i + 1; j <= n; j++) {
                if (arr[j] >= arr[i]) {
                    curr = curr + arr[i];
                } else {
                    break;
                }
            }
            res = Math.max(res, curr);
        }
        return res;
    }


    public static int getMaxArea(int arr[], int n) {
        Stack<Integer> s = new Stack<Integer>();
        int res = 0;
        int tp  = 0;
        int curr = 0;
        for(int i = 0; i < n; i++){
            while(s.isEmpty() == false && s.peek() >= arr[i]){
               tp =  s.pop();
                curr = arr[tp] * (s.empty() ? i: i - s.peek() -1 );
                res = Math.max( curr, res);
            }
            s.push(i);
        }
        while(!s.isEmpty()){
            tp =  s.pop();
            curr = arr[tp] * (s.empty() ? n: n - s.peek() - 1);
            res = Math.max( curr, res);
        }
        return res;
    }

    public static void mai(String args[]){
        int arr[]= {6,2,5,4,1,5,6};
        int n = 7;
        findLargestRectangularArea( arr, n);
        getMaxArea(arr, n);
    }
}
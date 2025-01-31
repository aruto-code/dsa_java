import java.util.ArrayList;
import java.util.Stack;

public class stockSpanProblem {

    public static void stockSpan(int arr[], int n){
        Stack<Integer> s = new Stack<>();
        ArrayList<Integer> prices = new ArrayList<>();
        s.push(0);
        System.out.println(1);
        for(int i = 0 ; i < n; i++){
            while(s.isEmpty() == false && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            int span = s.isEmpty() ? i+1: i - s.peek();
            System.out.println(span);
            s.push(i);

        }
    }
    public static void main(String args[]){
        int n = 5;
        int arr[] = {60, 10, 20, 15, 35, 50};
        stockSpan(arr, n);

    }
}

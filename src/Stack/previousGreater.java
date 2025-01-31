import java.util.Stack;

public class previousGreater {

    public static void findPrevGreat(int arr[], int n){
        for(int i = 0; i < n; i++){
            int j = 0;
            for( j = i-1; j >= 0; j--){
                if(arr[j] >= arr[i]){
                     System.out.println(arr[j]);
                     break;
                }
            }
            if(j == -1){
                System.out.println(-1);
            }
        }
    }
    public static void printPrevGreaterOptimal(int arr[], int n){
        Stack<Integer> s = new Stack<>();
        s.push(arr[0]);
        for(int i = 0; i < n; i++){
            while(s.isEmpty() == false && s.peek() <= arr[i]){
                s.pop();
            }
            int ans = s.isEmpty() ? -1 : s.peek();
            System.out.println(ans);
            s.push(arr[i]);
        }
    }
    public static void main(String args[]){
        int arr[] = {60,10,20,15,35,50};
        int n = 6;
        printPrevGreaterOptimal(arr, n);


    }

}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class nextGreater {

    public static void  nexGreter(int arr[], int n){
        ArrayList<Integer> v = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        st.push(n-1);
        for(int i = n-2; i >= 0; i--) {
            while (st.isEmpty() == false && st.peek() <= arr[i]) {
                st.pop();
            }
            int ans = st.isEmpty() ? -1 : st.peek();

            v.add(ans);
            st.push(arr[i]);


        }
        Collections.reverse(v);
        System.out.println(v);
        }

   public static void main(String args[]){
        int arr[] = {5,15,10,8,6,12,9,18};
        int n = 8;

       nexGreter( arr, n);

   }

}

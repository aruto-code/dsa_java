import java.util.ArrayDeque;
import java.util.Stack;

public class practiceStack {
    public static void main(String args[] ){
            Stack<Integer> st = new Stack<Integer>();
        ArrayDeque<Integer> st2 = new ArrayDeque<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st2.push(20);
        st2.push(30);
        System.out.println(st);
        System.out.println(st2);

    }
}

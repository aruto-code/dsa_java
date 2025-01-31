import java.util.ArrayList;
import java.util.Stack;

    public class getMinFunction {
   static ArrayList<Integer> s = new ArrayList<Integer>();
    static int min;

    public static int getMin(){
        return min;
    }

    public static int peek(){
        int t = s.get(s.size() - 1);
        return (t <= min )? min: t;

    }
    public static void push(int x){

        if(s.isEmpty()){
            min = x;
            s.add(x);
        }
        else if (x <= min){
            min = x;
            s.add(2*x - min);
        }
        else{
            s.add(x);
        }
    }
    public static int pop(){
        int t  = s.remove(s.size() - 1);
        if(t <= min){
            int res = min;
            min = 2*min - t;
            return res;
        }
            else
                return t;
    }

    public static  void main(String args[]){
        ArrayList<Integer> st = new ArrayList<Integer>();
        push(4);
        push(10);
        push(32);
        push(32);
        push(6);
        st.add(pop());
        st.add(pop());
        st.add((getMin()));
        push(2);
        System.out.println(st);
    }
}

import java.util.LinkedList;
import java.util.Queue;
public class practiceQueue {
    public static void ImplementQueue(){
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(20);
        int s = q.poll();
        System.out.println(s);
        //q.poll();
        q.offer(30);
        System.out.println(q);
    }
    public static void main(String args[]){
        ImplementQueue();
    }
}

import java.util.*;

class Mystack {
     Queue<Integer> q1;
     Queue<Integer> q2;

     Mystack(){
         q1 = new LinkedList<>();
         q2 = new LinkedList<>();;
     }
     int peek(){
        return q1.peek();
    }
    boolean isEmpty(){
         return (q1.size() == 0);
    }
    int pop(){
         return q1.poll();
    }
    void push(int x){
         while(q1.isEmpty() == false){
             q2.offer(q1.poll());
         }
         q1.offer(x);
         while(q2.isEmpty() == false){
             q1.offer(q2.poll());
         }
    }
}


public class ImplementStackUsingQueue {

    public static void main(String args[])
    {
        Mystack s = new Mystack();
        s.push(20);
        s.push(40);
        s.push(50);
        System.out.println(s);
        s.pop();
        System.out.println(s);
    }
}

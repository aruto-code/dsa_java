import java.util.*;

public class generateMember {

    public static void printFirstN(int n){
        Queue<String> q= new LinkedList<>();
        q.offer("5");
        q.offer("6");
        for(int count = 0;count < n;count++){
            String curr = q.poll();
            System.out.println(curr);
            q.offer(curr+'5');
            q.offer(curr+'6');
        }
    }
    public static void main(String args[]){
        int n = 10;
            printFirstN(n);
    }
}

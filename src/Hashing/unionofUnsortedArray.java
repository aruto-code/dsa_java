import java.util.HashSet;

public class unionofUnsortedArray {

    static int unionCount(int a[], int b[]){
        HashSet<Integer> h = new HashSet<>();
        for(int x: a){
            h.add(x);
        }
        for(int x: b){
            h.add(x);
        }
        return h.size();
    }

    public static void main(String args[]){
        int a[]  = {9,5,4,2,3};
        int b[] = {1,7,36,12};
        int temp = unionCount(a,b);
        System.out.println(temp);
    }
}

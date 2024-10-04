import java.util.HashSet;

public class insertionof2unsortedarrays {

    static void insertion( int b[], int a[]){
        for(int i = 0; i < a.length;i++){
            boolean flag = false;
            for(int j = 0; j < b.length; j++){
                if(a[i] == b[j]){
                    flag = true;
                }
            }
            if(flag == true){
                System.out.println(a[i] + " ");
            }
        }
    }

    static void intersect(int a[], int b[]){
        HashSet<Integer> h = new HashSet<>();
        for(int i = 0 ; i < b.length ;i++){
            h.add(b[i]);
        }
        for(int i = 0 ; i < a.length ;i++){
            if(h.contains(a[i])){
                System.out.println(a[i] + " ");
            }

        }
    }

    public static void main(String args[]){
        int a[] = {2,3,4,5,6};
        int b[] = {3,2,4,9,8};
        insertion(b,  a);
        intersect(a, b);
    }
}

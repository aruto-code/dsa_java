import java.util.Arrays;

public class leftmostNonRepeating {

    static int nonReapNaive(String str){
        for(int i = 0; i< str.length(); i++){
            boolean flag = false;
            for(int j = 0; j < str.length(); i++){
                if(i != j && str.charAt(i) == str.charAt(j)){
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                return i;
            }
        }
        return -1;
    }

    static int leftmostNonRepBetter(String str){
        final int CHAR = 256;
        int count[] = new int[CHAR];
        for(int i = 0 ; i < str.length(); i++){
            count[str.charAt(i)]++;
        }
        for(int i = 0 ; i < str.length(); i++){
            if(count[str.charAt(i)] == 1)
            {
                return i;
            }
        }
        return -1;
    }
    static int nonRepEfficient(String str){
        final int CHAR = 256;
        int fi[] = new int[CHAR];
        Arrays.fill(fi, -1);
        for(int i = 0; i < str.length(); i++){
            if(fi[str.charAt(i)] == -1){
                fi[str.charAt(i)] = i;
            }
            else{
                fi[str.charAt(i)] = -2;
            }
        }
        int res = Integer.MAX_VALUE;
        for(int i = 0 ; i < CHAR; i++){
            res = Math.min(res, fi[i]);
        }
        return (res == Integer.MAX_VALUE)? -1: res;
    }

    public static void main(String args[]){

    }
}

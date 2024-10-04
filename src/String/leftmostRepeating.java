import java.util.Arrays;

public class leftmostRepeating {

    static int leftmostRepNaive(String str){
        for(int i = 0; i < str.length(); i++){
            for(int j = i+1 ; j < str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    return i;
                }
            }
        }
        return -1;
    }

    static int leftmostBetter(String str){
        final int CHAR = 256;
        int count[] = new int[CHAR];
        for(int i = 0 ; i < str.length(); i++){
            count[str.charAt(i)]++;
        }
        for(int i = 0 ; i < str.length(); i++){
            if(count[str.charAt(i)] >= 1)
            {
                return i;
            }
        }
        return -1;
    }

    static int lefmostRepEfficient1(String str){
        final int CHAR = 256;
        int fi[] = new int[CHAR];
        Arrays.fill(fi, -1);
        int res = Integer.MAX_VALUE;
        for(int i = 0 ; i < str.length(); i++) {
            if(fi[str.charAt(i)] == -1){
                fi[str.charAt(i)] = i;
            }
            else{
                res = Math.min(res, fi[str.charAt(i)]);
            }
        }
        return res;
    }

    static int leftmostRepEfficient2(String str){
        final int CHAR = 256;
        boolean []visited = new boolean[CHAR];
        int res = -1;
        for(int i = str.length(); i >= 0; i--){
            if(visited[str.charAt(i)]){
                res = i;
            }
            else{
                visited[str.charAt(i)] = true;
            }
        }

        return res;
    }

    public static void main(String args[]){
        String str = "abccda";
    }
}

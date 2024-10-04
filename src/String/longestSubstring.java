import java.util.Arrays;

public class longestSubstring {

    boolean areDistinct(String str, int i , int j){
        boolean visited[] = new boolean[256];
        for(int k = i; k <= j; k++){
            if(visited[str.charAt(k)] == true){
                return false;
            }
            visited[str.charAt(k)] = true;
        }
        return false;
    }
    int largestDist(String str){
        int n = str.length();
        int res = 0;
        for(int i = 0; i < n;i++){
            for(int j = i; j < n; j++){
                if(areDistinct(str, i,j)){
                    res = Math.max(res, j-i+1);
                }
            }
        }
        return res;
    }
    static int longestDis(String str){
        int n = str.length();
        int res = 0;
        int prev[]= new int[256];
        Arrays.fill(prev ,-1);
        int i = 0;
        for(int j = 0; j < n; j++){
            i = Math.max(i, prev[str.charAt(j) + 1]);
            int maxEnd = j - i +1;
            res = Math.max(res, maxEnd);
            prev[str.charAt(j)] = j;
        }
        return res;
    }

    public static void main(String args[]){

    }
}

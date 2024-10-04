public class stringSubseq {

    static boolean isSubSeq(String s1, String s2){
        int j = 0;
        int n = s1.length();
        int m = s2.length();
        for(int i = 0; i < n && j < m;i++){
            if(s1.charAt(i) == s2.charAt(j)){
                j++;
            }
        }
        return (j == m);
    }


    public static void main(String args[]){
        String s1 = "ABCD";
        String s2 = "AD";
        boolean temp = isSubSeq( s1, s2);
        System.out.println(temp);
    }
}

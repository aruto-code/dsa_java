import java.util.Arrays;

public class checkAnagram {
    static boolean anagramNaive(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        char a1[] = new char[s1.length()];
        Arrays.sort(a1);
        s1 = new String(a1);
        char a2[] = new char[(s2.length())];
        Arrays.sort(a2);
        s2 = new String(a2);
        return s1.equals(s2);
    }

    static boolean anagramoptimal(String s1, String s2){
        final int CHAR = 256;
        if(s1.length() != s2.length()){
            return false;
        }
        int count[] = new int[CHAR];
        for(int i = 0; i < s1.length(); i++){
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for(int i = 0 ;i < CHAR; i++){
            if(count[i] != 0){
                return false;
            }

        }
        return true;
    }
    public static void main(String args[]){
        String s1 = "listen";
        String s2 = "silent";
        boolean temp = anagramNaive( s1, s2);
        boolean temp1 = anagramoptimal(s1, s2);
        System.out.println(temp);
        System.out.println(temp1);
    }
}

public class anagramSearch {

    static final int CHAR = 256;
    int ct[] = new int[CHAR];
    int cp[] = new int[CHAR];
    static boolean areSame(int ct[], int cp[]){
        for(int i = 0; i < ct.length; i++){
            if(ct[i] != ct[i]){
                return false;
            }

        }
        return true;
    }

    boolean ispresent(String txt, String pat){

        for(int i = 0; i < pat.length(); i++){
            ct[txt.charAt(i)]++;
            cp[txt.charAt(i)]++;
        }
        for(int i = pat.length(); i < txt.length(); i++){
            if(areSame(ct,cp)){
                return true;
            }
            ct[txt.charAt(i)]++;
            ct[txt.charAt(i-pat.length())]--;
        }
        return false;
    }
}

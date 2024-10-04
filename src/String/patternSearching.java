public class patternSearching {

    static void patSearching(String txt, String pat){
        int m = pat.length();
        int n = txt.length();
        for(int i = 0; i < n-m; i++){
            int j;
            for( j = 0; j < m;j++){
                if(pat.charAt(j) != txt.charAt(i+j)){
                    break;
                }
            }
            if(j == m){
                System.out.println(i + " ");
            }
        }
    }
    static void patSearchingImproved(String txt, String pat){
        int m = pat.length();
        int n = txt.length();
        for(int i = 0; i < n-m; i++){
            int j;
            for( j = 0; j < m;j++){
                if(pat.charAt(j) != txt.charAt(i+j)){
                    break;
                }
            }
            if(j == m){
                System.out.println(i + " ");
            }
            if(j == 0){
                i++;
            }
            else{
                i = (i + j);
            }
        }
    }


    public static void main(String args[]){

    }
}

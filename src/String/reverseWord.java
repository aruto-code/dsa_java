public class reverseWord {

    static void reverse(char str[], int low, int high){
        while(low <= high){
            char temp = str[low];
            str[low] = str[high];
            str[high] = temp;
            low++;
            high--;
        }
    }
    static void reverseWords(char str[]){
        int start = 0;
        int n = str.length;
        for(int end = 0; end < n ; end++){
            if(str[end] == ' '){
                reverse(str, start , end-1);
                start = end + 1;
            }
        }
        reverse(str,start, n-1);
        reverse(str, 0,n-1);
        System.out.println(str);
    }
    public static void main(String args[]){
        String str = "welcome to gfg";
        reverseWords(str.toCharArray());
    }
}

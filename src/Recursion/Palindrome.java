public class Palindrome {

    static boolean isPalindrome(String str, int start, int end){
        if(start >= end ){
            return true;
        }
        return (str.charAt(start) == str.charAt(end) && isPalindrome(str,start +1 , end - 1));
    }


    public static void main(String args[]){
        String str = "aebba";
        int start = 0;
        int end = str.length() - 1 ;
        boolean s = isPalindrome( str, start, end);
        System.out.println(s);
    }

}

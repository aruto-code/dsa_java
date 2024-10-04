public class isPalindrome {

    static boolean isPal(String str){
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder rev = new StringBuilder(str);
        rev.reverse();
        return str.equals(rev.toString());
    }
    static boolean isPalOptimal(String str){
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int beg = 0;
        int end  = str.length()-1;
        while(beg < end){
            if(str.charAt(beg) != str.charAt(end)){
                return false;
            }
            beg++;
            end--;
        }
        return true;
    }


    public static void main(String args[]){
       String str = "A man, a plan, a canal: Panama";
        boolean temp = isPal(str);
        boolean temp2 =  isPalOptimal(str);
        System.out.println(temp);
        System.out.println(temp2);
    }
}

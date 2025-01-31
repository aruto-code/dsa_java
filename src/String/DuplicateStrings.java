import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
public class DuplicateStrings {
    public static void getDuplicatesStringNumber(String str){
        HashMap<Character, Integer> map  = new HashMap<>();
        for(int i = 0 ; i < str.length(); i++){
            //System.out.println(str.charAt(i));
            map.put(str.charAt(i) , map.getOrDefault(str.charAt(i), 0) + 1);
        }
        for (Map.Entry<Character,Integer> e : map.entrySet()){
            System.out.print(e.getValue() + e.getKey());
        }
//        for(int i = 0 ; i < str.length(); i++){
//            //System.out.println(str.charAt(i));
//           if(map.containsKey(str.charAt(i))){
//               System.out.print(map.get(str.charAt(i)));
//               System.out.print(str.charAt(i));
//               map.remove(str.charAt(i));
//           }
//        }
    }
    public static void reverseString(String str){
        System.out.println();
        char s[] = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;
        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        for(int i = 0 ; i < s.length; i++){
            System.out.print(s[i]);
        }


    }
    public static void main(String args[]){
        String str = "AABBCDDDD";
        getDuplicatesStringNumber(str);
        reverseString(str);
    }
}

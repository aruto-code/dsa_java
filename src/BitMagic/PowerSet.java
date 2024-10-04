import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PowerSet {
    static void powerSet(String s){
        char[] array = s.toCharArray();
        int n = s.length();
        int psize = (1 << n);
        for(int i = 0; i < psize; i++){
            for(int j = 0; j < n;j++)
            {
               if ((i & (1 << j))!= 0){
                   System.out.print(array[j]);
               }

            }
            System.out.println();
        }

    }
    static List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> lst = new ArrayList<>();

        int psize = (1 << n);
        for(int i =0; i < psize;i++){
            lst.add(new ArrayList<>());
        }
        int x = 0;
        for(int i = 0; i < psize; i++){
            for(int j = 0; j < n;j++)
            {
                if ((i & (1 << j))!= 0){
                   lst.get(i).add(nums[j]);
                }
            }
        }
        return lst;
    }

    public static void main(String args[]){
        List<List<Integer>> res = new ArrayList<>();
        String  s = "abc";
      //  powerSet(s);
        int nums[] = {1,2,3};
        res = subsets(nums);
        System.out.println(res);

    }
}


import java.util.*;
public class meetingmaxguests {

    static int maxGuests(int arr[], int dep[]){
        int n = arr.length;
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i = 1, j = 0, res = 0, curr = 1;
        while(i < n && j < n){
            if(arr[i] <= dep[j]){
                i++;
                curr++;
            }
            else{
                j++;
                curr--;
            }
            res = Math.max(res, curr);
        }
        return res;
    }


    public static void main(String args[]){
        int arr[] = {900,940,950,1100,1500,1800};
        int dep[] = {910,1200,1120,1130, 1900,2000};
        int n = maxGuests( arr, dep);
        System.out.println(n);
    }
}

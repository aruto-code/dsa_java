import java.util.Comparator;
import java.util.*;
class Interval{
    int start;
    int end;
    Interval (int x, int y){
        this.start = x;
        this.end = y;
    }
}
class myComp implements Comparator<Interval>{
    public int compare(Interval i1, Interval i2){
        return i1.start - i2.start;
    }
}

public class mergeOverlappingIntervals {

    static void mergeInterval(Interval arr[]){
        Arrays.sort(arr, new myComp());
        int n = arr.length;
        int res = 0;
        for(int i = 1; i < n; i++){
            if(arr[res].end >= arr[i].start){
                arr[res].end = Math.max(arr[res].end, arr[i].end);
                arr[res].start = Math.min(arr[res].start, arr[i].start);
            }
            else{
                res++;
                arr[res] = arr[i];
            }
        }
        for(int i = 0; i <= res; i++){
            System.out.println(arr[i].start + " " + arr[i].end);
        }
    }

    public static void main(String args[]){
        Interval arr[] = { new Interval(1, 3), new Interval(2, 6), new Interval(8, 10), new Interval(15, 18) };
        mergeInterval(arr);
    }
}

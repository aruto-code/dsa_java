public class squareRoot {
    static int sqRoot(int x){
        int i = 1;
        while( i * i <= x ){
            i++;
        }
        return (i - 1);
    }

    static int sqRootOptimal(int x){
        int low = 1, high = x, ans = -1;
        while(low <= high){
            int mid = (low + high)/2;
            int msq = mid * mid;
            if(msq == x){
                return mid;
            }
            else if (msq > x){
                high = mid - 1;
            }
            else{
                low = mid + 1;
                 ans = mid;
            }

        }
        return ans;
    }


    public static void main(String args[]){
            int x = 7;
        int res =  sqRootOptimal( x);
        System.out.println(res);
    }
}

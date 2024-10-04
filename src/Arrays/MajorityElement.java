public class MajorityElement {

    static int majority(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int count = 1;
            for(int j = i + 1; j < n ;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
                }
            if(count > n/2){
                return arr[i];
            }
        }
        return -1;
    }

    static int findmajority(int arr[]){
        int n = arr.length;
        int res = 0, count = 1;
        for(int i = 0; i< n ;i++){
            if(arr[res] == arr[i]){
                count++;
            }
            else {
                count --;
            }
            if(count == 0){
                res = i;
                count = 1;
            }
        }
        count = 0;
        for(int i = 0; i < n; i++) {
            if(arr[res] == arr[i]){
                count++;
            }
        }
        if(count > n/2) {
            return arr[res];
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {8,3,4,8,8};
        int res = majority( arr);
        int res2 = findmajority(arr);
        System.out.println(res);
        System.out.println(res2);

    }
}

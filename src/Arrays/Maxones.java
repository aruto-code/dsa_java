public class Maxones {

    static int maxConsecutiveNaive(int arr[]){
        int res = 0;
        for(int i = 0; i < arr.length; i++){
            int curr = 0;
            for(int j = i; j< arr.length;j++){
                if(arr[j] == 1){
                    curr++;
                }
                else{
                    break;
                }
                    res = Math.max(res , curr);
            }
        }
        return res;
    }
    static int maxConsecutiveOptimal(int arr[]){
        int res = 0;
        int curr = 0;
        for(int i = 1; i < arr.length; i++){
                if(arr[i] == 0){
                    curr = 0;
                }
                else{
                   curr++;
                }
                res = Math.max(res , curr);

        }
        return res;
    }

    public static void main(String args[]){
        int arr[] ={1,1,1,1,1,1,0,0,0,1,0,1,1,1,1,1,1,1,};
        int res = maxConsecutiveNaive(arr);
        int res1 = maxConsecutiveOptimal(arr);
        System.out.println(res);
        System.out.println(res1);
    }}

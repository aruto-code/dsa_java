public class maxAppearingInRange {

     static int maxAppearNaive(int left[], int right[]){
         int freq[] = new int[100];
         for(int i = 0; i < left.length; i++ ){
             for(int j = left[i]; j <= right[i]; j++){
                 freq[j] = freq[j] + 1;
             }

         }
         int res = 0;

         for(int i = 1; i < 100; i++){
             if(freq[i] > freq[res]){
                 res = i;
             }
         }
        return res;
     }

     static int maxAppear(int left[], int right[]){
         int freq[] = new int[101];
         for(int i = 0; i < left.length; i++){
             freq[left[i]]++;
             freq[right[i] + 1]--;
         }
         int res =0;
         for(int i = 1; i < 101; i++){
             freq[i] = freq[i-1] + freq[i];
             if(freq[i] > freq[res]){
                 res = i;
             }
         }
         return res;
     }

     public static void main(String args[]){
        int left[] = {1,2,5,15};
        int right[] = {5,8,7,18};
        int res =  maxAppearNaive(  left, right);
         int res2 = maxAppear( left, right);
        System.out.println(res);
         System.out.println(res2);

    }
}

public class countInversions {
    static int naivecountInversions(int arr[]){
        int res = 0;
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            for(int j = i + 1; j < n;j++){
                if(arr[i] > arr[j]){
                    res++;
                }

            }
        }
        return  res;
    }
    static int countInversionoptimal(int arr[], int l, int r){
        int res = 0;
        if(l < r){
            int m = (l + r)/2;
            res += countInversionoptimal(arr, l, m);
            res += countInversionoptimal(arr, m+1, r);
            res += countandmerge(arr, l,m,r);
        }
        return res;
    }
    static int countandmerge(int arr[], int l , int m , int r){
        int n1 = m - l + 1, n2 = r - m;
        int left[] = new int[n1];
        int right[] = new int[n2];
        for(int i = 0; i < n1 ; i++){
            left[i] = arr[l + i];
        }
        for(int i = 0; i < n2 ; i++){
            right[i] = arr[m + i + 1];
        }
        int res = 0, i = 0,j = 0, k = l;
        while(i < n1 && j < n2){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }
            else {
                arr[k] = right[j];
                j++;
                res = res + (n1 - i);
            }
            k++;
        }
        while(i < n1){
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j < n2){
            arr[k] = right[j];
            j++;
            k++;
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {2,4,1,3,5};
        int l = 0;
        int r = (arr.length)-1;
        int  res = naivecountInversions(arr);
        int res2 = countInversionoptimal( arr, l, r);
        System.out.println(res);
        System.out.println(res2);
    }
}

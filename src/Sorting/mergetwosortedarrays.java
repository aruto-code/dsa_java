import java.util.*;

public class mergetwosortedarrays {
    static void naiveMergeSort(int a[], int b[]){
        int n = a.length, m = b.length;
        int c[] = new int[n + m];
        for(int i = 0 ; i < n; i++){
            c[i] = a[i];
        }
        for(int i = 0 ; i < m; i++){
            c[i+ n] = a[i];
        }
        Arrays.sort(c);
        for(int i = 0 ; i <(n+m); i++) {
            System.out.println(c[i] + " ");
        }
    }

    static void optimalMergeSort(int a[], int b[]){
        int n = a.length, m = b.length;
        int i = 0, j = 0;
        while(i < n && j < m){
            if(a[i] <= b[j]){
                System.out.println(a[i] + " ");
                i++;
            }
            else{
                System.out.println(b[j] + " ");
                j++;
            }
        }
        while(i < n){
            System.out.println(a[i] + " ");
            i++;
        }
        while(j < m){
            System.out.println(b[j] + " ");
            j++;
        }
    }

    static void leetcodesol(int a[], int  b[], int m, int n){
        int i = m -1;
        int j = n-1;
        int k = m+ n -1;
        while(i >= 0 && j >= 0){
            if(a[i] >= b[j]){
                   a[k] = a[i];
                   i--;
            }
            else{
                a[k] = b[j];
                j--;
            }
            k--;
        }
        while(j >= 0){
            a[k] = b[j];
            j--;
            k--;
        }
    }

    public static void main(String args){
        int a[] = {10,20,30};
        int b[] = {4,7,8,9};
        naiveMergeSort( a, b);
        optimalMergeSort( a, b);
    }
}

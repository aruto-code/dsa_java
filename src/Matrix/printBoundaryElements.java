import java.util.ArrayList;

public class printBoundaryElements {
    static int[] Btreversal(int mat[][]){
        int r = mat.length;
        int c = mat[0].length;
        int arr[] = new int[r*c];
        //ArrayList<Integer> adj = new ArrayList<Integer>();
        int index = 0;
        if(r == 1) {
            for (int i = 0; i < r; i++) {
                arr[i] = mat[0][i] ;
            }
            return arr;
        }

        else if(c == 1) {
        for (int i = 0; i < r; i++) {
            arr[i] = mat[0][i] ;
        }
            return arr;
    }
         else{
             for(int i = 0 ; i < c; i++){
                 arr[index] = mat[0][i];
                 index++;
             }
            for(int i = 1 ; i < r; i++){
                arr[index] = mat[i][c-1];
                index++;
            }
            for(int i = c-2 ; i >= 0; i--){
                arr[index] = mat[r-1][i];
                index++;
            }
            for(int i = r-2 ; i > 0; i--){
                arr[index] = mat[i][0];
                index++;
            }
        }
        return arr;
    }

    public static void main(String args[]){
        int mat[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int temp[] =  new int[100];
        temp = Btreversal(mat);
        for(int i = 0 ; i < temp.length; i++){
            System.out.print(temp[i] + " ");;
        }
    }
}

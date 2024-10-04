public class tranposeMatrix {

    static void naiveTranspose(int mat[][], int n){
        int temp[][] = new int[n][n];
        for(int i = 0; i< n; i++){
            for(int j = 0; j < n; j++){
                temp[i][j] = mat[j][i];
            }
        }
        for(int i = 0; i< n; i++){
            for(int j = 0; j < n; j++){
               mat[i][j] = temp[i][j];
            }
        }
        for(int i = 0; i< n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }

    static void optimaltranspose(int mat[][], int n){
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int n = 3;
        optimaltranspose(mat, n);
        //naiveTranspose(mat, n);
    }
}

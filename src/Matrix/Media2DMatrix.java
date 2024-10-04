import java.util.Arrays;

public class Media2DMatrix {

    static int MedMatrix(int mat[][], int r, int c){
        int min = mat[0][0], max = mat[0][c-1];
        for(int i = 1; i < r;i++){
            if(mat[i][0] < min ){
                min = mat[i][0];
            }
            if(mat[i][c-1] > min ){
                max = mat[i][c-1];
            }
        }
        int medpos = (r*c + 1)/2;
        while(min < max){
            int mid = (min + max)/2;
            int midpos = 0;
            for(int i = 0; i < r; i++){
                int pos = Arrays.binarySearch(mat[i], mid) + 1;
                midpos = midpos + Math.abs(pos);
            }
            if(medpos > midpos){
                min = mid + 1;
            }
            else{
                max = mid;
            }
        }
       return min;
    }

    public static void main(String args[]){
        int arr[][] = {{1,10,20},{15,25,30},{5,8,40}};
        int r = 3;
        int c = 3;
        int temp = MedMatrix(arr, r, c);
        System.out.println(temp);
    }
}

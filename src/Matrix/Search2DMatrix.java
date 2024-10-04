public class Search2DMatrix {

    static void niaveSearch(int mat[][], int x){
        int r = mat.length;
        int c = mat[0].length;
        for(int i = 0; i < r; i++){
            for(int j = 0 ; j < c; j++){
                if(mat[i][j] == x){
                    System.out.println("Found at " + "(" + i + "," + j + ")");
                    return;
                }
            }
        }
        System.out.println("Not Found");
    }

    static void optimalSearch(int mat[][], int x){
        int r = mat.length;
        int c = mat[0].length;
        int i = 0, j = c-1;
        while(i < r && j >= 0){
            if(mat[i][j] == x){
                System.out.println("Found at " + "(" + i + "," + j + ")");
                return;
            }
            else if(mat[i][j] > x){
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println("Not Found");
    }

    public static void main(String args[]){
        int arr[][] =  {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int x = 41;
        //niaveSearch( arr, x);
        optimalSearch(arr, x);
    }
}

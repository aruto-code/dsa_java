public class printSnakePattern {
    static void printSnake(int arr[][], int r, int c){
        for(int i = 0 ; i < r;i++){
            if(i % 2 == 0){
                for(int j = 0; j < c; j++){
                    System.out.print(arr[i][j] + " ");
                }
            }
            else{
                for(int j = c-1; j >= 0; j--){
                    System.out.print(arr[i][j] + " ");
                }
            }

        }
    }

    public static void main(String args[]) {
        int arr[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 24, 15, 16}};
        int r = arr.length;
        int c = 4;
        printSnake(arr, r, c);
    }
    }


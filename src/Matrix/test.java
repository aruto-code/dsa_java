public class test {
    public static void main(String args[]){
        int n = 3, m = 3;
        int arr[][] = new int[m][n];
        for(int i = 0; i< m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = j;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

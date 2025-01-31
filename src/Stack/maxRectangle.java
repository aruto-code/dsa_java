import java.util.Stack;

    public class maxRectangle {

        public static int getMaxArea(int arr[], int n) {
            Stack<Integer> s = new Stack<Integer>();
            int res = 0;
            int tp = 0;
            int curr = 0;
            for (int i = 0; i < n; i++) {
                while (s.isEmpty() == false && arr[s.peek()] >= arr[i]) {
                    tp = s.pop();
                    curr = arr[tp] * (s.empty() ? i : i - s.peek() - 1);
                    res = Math.max(curr, res);
                }
                s.push(i);
            }
            while (!s.isEmpty()) {
                tp = s.pop();
                curr = arr[tp] * (s.empty() ? n : n - s.peek() -1 );
                res = Math.max(curr, res);
            }
            return res;
        }

        public static int maxRect(int mat[][], int r, int c) {
            int res = getMaxArea(mat[0], c);
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (mat[i][j] == 1) {
                        mat[i][j] += mat[i - 1][j];
                    }
                }
                res = Math.max(res, getMaxArea(mat[i - 1], c));
            }
            return res;
        }

        public static void main(String args[]) {
            int mat[][] = {{0, 1, 1},
                    {1, 1, 1},
                    {0, 1, 1}};
            int r = 0;
            int c = 0;
            maxRect(mat, r,c);

        }
    }


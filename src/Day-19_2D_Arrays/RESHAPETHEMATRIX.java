public class RESHAPETHEMATRIX {

    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int m = mat.length;
        int n = mat[0].length;

        if (m * n != r * c) {
            return mat;
        }

        int[][] ans = new int[r][c];

        for (int i = 0; i < m * n; i++) {

            ans[i / c][i % c] = mat[i / n][i % n];
        }

        return ans;
    }

    public static void main(String[] args) {

        int[][] mat = {{1, 2}, {3, 4}};

        RESHAPETHEMATRIX obj = new RESHAPETHEMATRIX();

        int[][] res = obj.matrixReshape(mat, 1, 4);

        for (int[] row : res) {
            for (int x : row) {
                System.out.print(x + " ");
            }
        }
    }
}
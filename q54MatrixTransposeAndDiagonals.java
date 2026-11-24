import java.util.Arrays;

public class q54MatrixTransposeAndDiagonals {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Primary Diagonal Sum:   " + primaryDiagonalSum(matrix));
        System.out.println("Secondary Diagonal Sum: " + secondaryDiagonalSum(matrix));

        transposeInPlace(matrix);
        System.out.println("Transposed Matrix:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int primaryDiagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
        }
        return sum;
    }

    public static int secondaryDiagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            sum += mat[i][n - 1 - i];
        }
        return sum;
    }

    public static void transposeInPlace(int[][] mat) {
        int n = mat.length;
        for (int r = 0; r < n; r++) {
            for (int c = r + 1; c < n; c++) {
                int temp = mat[r][c];
                mat[r][c] = mat[c][r];
                mat[c][r] = temp;
            }
        }
    }
}
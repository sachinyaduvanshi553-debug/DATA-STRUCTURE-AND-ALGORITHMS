import java.util.*;

public class LUCKYNUMBERSINMATRIX {

    public List<Integer> luckyNumbers(int[][] matrix) {

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {

            int minCol = 0;

            for (int j = 1; j < matrix[0].length; j++) {

                if (matrix[i][j] < matrix[i][minCol]) {
                    minCol = j;
                }
            }

            boolean lucky = true;

            for (int k = 0; k < matrix.length; k++) {

                if (matrix[k][minCol] > matrix[i][minCol]) {
                    lucky = false;
                    break;
                }
            }

            if (lucky) {
                result.add(matrix[i][minCol]);
            }
        }

        return result;
    }
}
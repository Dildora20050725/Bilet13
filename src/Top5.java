public class Top5 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, -2, 3, -4},
                {-5, 6, 7, -8},
                {9, 10, -11, -12}
        };

        int positiveCount = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > 0) {
                    positiveCount++;
                }
            }
        }

        System.out.println("Musbat sonlar soni: " + positiveCount);
    }
}

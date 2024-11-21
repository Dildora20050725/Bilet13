public class Top4 {
    public static void main(String[] args) {
        int[] array = {-1, 2, -3, 4, -5, 6, 7, -8, 9, -10};

        int negativeCount = 0;

        for (int num : array) {
            if (num < 0) {
                negativeCount++;
            }
        }

        System.out.println("Manfiy sonlar soni: " + negativeCount);
    }
}

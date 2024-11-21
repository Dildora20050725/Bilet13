import java.util.Scanner;

public class Top1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Satrni kiriting:");
        String s = scanner.nextLine();

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'c' || s.charAt(i) == 'C') {
                count++;
            }
        }

        System.out.println("'c' harfi soni: " + count);
    }
}

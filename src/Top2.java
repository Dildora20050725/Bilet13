import java.util.Scanner;

public class Top2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Satrni kiriting:");
        String s = scanner.nextLine();

        int index = s.indexOf('A');
        if (index != -1) {
            System.out.println("'A' harfi birinchi marta indeks: " + index);
        } else {
            System.out.println("'A' harfi topilmadi.");
        }
    }
}


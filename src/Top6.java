import java.util.Scanner;

public class Top6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Matnni kiriting:");
        String text = scanner.nextLine();

        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("is")) {
                if (i + 1 < words.length && words[i + 1].equals("not")) {
                    result.append(words[i]).append(" ");
                } else {
                    result.append("is not ").append(" ");
                }
            } else {
                result.append(words[i]).append(" ");
            }
        }

        System.out.println(result.toString().trim());
    }
}

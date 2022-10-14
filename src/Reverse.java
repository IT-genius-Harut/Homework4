import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input string");
        String str = scanner.nextLine();
        String revers = reverseString(str);
        System.out.println(revers);
    }

    public static String reverseString(String string) {
        if (string.isEmpty()) {
            return string;
        }
        return reverseString(string.substring(1)) + string.charAt(0);
    }
}

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input number");
        int number = scanner.nextInt();
        int bin = calculateBinary(number);
        System.out.println("The binary form of the decimal number " + number + " is: " + bin);
    }

    static int calculateBinary(int number) {
        if (number == 0)
            return number;
        else
            return (number % 2) + (10 * (calculateBinary(number / 2)));
    }
}

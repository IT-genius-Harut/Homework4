import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input number");
        int number = scanner.nextInt();
        int factorial = calculateFactorial(number);
        System.out.println("Factorial " + number + " = " + factorial);
    }
    public static int calculateFactorial(int number){
        if (number == 1){
            return number;
        }
        return number * calculateFactorial(number - 1);
    }
}

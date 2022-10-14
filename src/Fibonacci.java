import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input number");
        int number = scanner.nextInt();
        fibonacciSeries(number);
        System.out.print("fibonacci numbers are: ");
        for (int i = 1; i <= number; i++) {
            System.out.print(fibonacciSeries(i) + " ");
        }
    }
    public static int fibonacciSeries(int number){
        if (number == 0 || number == 1){
            return number;
        }
        return fibonacciSeries(number -1 ) + fibonacciSeries(number - 2);
    }
}

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input numbers");
        int N = scanner.nextInt();
        int P = scanner.nextInt();

        System.out.println(power(N, P));
    }

    static int power(int N, int P) {
        if (P == 0)
            return 1;
        else
            return N * power(N, P - 1);
    }
}

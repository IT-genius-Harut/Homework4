import java.util.Scanner;

import static java.lang.StrictMath.pow;

public class RevOfNum {
    public static void main(String[] args) {
        int n, count = 0, a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        n = sc.nextInt();
        a = n;
        while (a > 0) {
            count++;
            a = a / 10;
        }
        RevOfNum obj = new RevOfNum();
        int b = obj.reverse(n, count);
        System.out.println("Reverse of the number is :" + b);
    }

    int reverse(int x, int y) {
        if (y == 1) {
            return x;
        } else {
            int z = x % 10;
            x = x / 10;
            return (int) ((z * pow(10, y - 1)) + reverse(x, --y));
        }
    }
}

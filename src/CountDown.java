public class CountDown {
    public static void main(String[] args) {
        System.out.println("please input number");

        int min = 25;
        int max = 30;
        for (int i = 0; i <= 5; i++) {
            stej(min, max);
        }
    }

    public static void stej(int max, int min) {
        if (max == min)
            System.out.print(min);
        else {
            System.out.print(max + " ");

        }
    }
}

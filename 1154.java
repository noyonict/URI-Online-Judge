import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x = in.nextInt();
        int sum = 0, count = 0;
        while (x >= 0) {
            sum += x;
            x = in.nextInt();
            count++;
        }
        float avg = (float) (sum * 1.0f / count);
        System.out.printf("%.2f\n", avg);
    }

}

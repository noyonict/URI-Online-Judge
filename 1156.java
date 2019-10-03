import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int i;
        float s = 0;
        int div = 1;
        for (i = 1; i <= 39; i += 2) {
            s += (i * 1.0f) / div;
            div *= 2;
        }
        System.out.printf("%.2f\n", s);
    }

}

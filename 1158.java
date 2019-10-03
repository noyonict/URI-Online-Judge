import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            if ((x & 1) == 0) {
                x++;
            }
            int y = in.nextInt();

            System.out.println((x + y - 1) * y);
        }
    }

}

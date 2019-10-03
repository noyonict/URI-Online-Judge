import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x = in.nextInt();
        while (x != 0) {
            int j, k = 1;
            while (k <= x) {
                for (j = 1; j <= x; j++) {
                    if (j != x) {
                        System.out.print(k + " ");
                    } else {
                        System.out.println(k);
                    }
                    k++;
                }
            }
            x = in.nextInt();
        }
    }

}

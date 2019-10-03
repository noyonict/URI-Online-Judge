import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int i;
        int[] x = new int[10];
        for (i = 0; i < x.length; i++) {
            x[i] = in.nextInt();
        }
        for (i = 0; i < x.length; i++) {
            if (x[i] <= 0) {
                x[i] = 1;
            }
            System.out.println("X[" + i + "] = " + x[i]);
        }

    }

}

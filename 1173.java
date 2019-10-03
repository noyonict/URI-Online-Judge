import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int i;
        int[] x = new int[10];
        int v = in.nextInt();
        for (i = 0; i < x.length; i++) {
            x[i] = v;
            System.out.println("N[" + i + "] = " + x[i]);
            v *= 2;
        }

    }

}

import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int n = in.nextInt();
        while (n > 0) {
            int i;
            int x = in.nextInt();
            boolean prime = true;
            for (i = 2; i < x; i++) {
                if (x % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.println(x + " eh primo");
            } else {
                System.out.println(x + " nao eh primo");
            }
            n--;
        }
    }

}
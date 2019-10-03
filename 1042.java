import java.util.Scanner;
//problem no: 1042

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        int a = x;
        int b = y;
        int c = z;
        if (a > b && a > c) {

            if (b > c) {
                System.out.println(c);
                System.out.println(b);
            } else {
                System.out.println(b);
                System.out.println(c);
            }
            System.out.println(a);
        } else if (b > a && b > c) {

            if (a > c) {
                System.out.println(c);
                System.out.println(a);
            } else {
                System.out.println(a);
                System.out.println(c);
            }
            System.out.println(b);
        } else if (c > a && c > b) {

            if (a > b) {
                System.out.println(b);
                System.out.println(a);
            } else {
                System.out.println(a);
                System.out.println(b);
            }
            System.out.println(c);
        }
        System.out.println("\n"+x);
        System.out.println(y);
        System.out.println(z);

    }
}

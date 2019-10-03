import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int i;
        float s = 0;
        for(i = 1; i <= 100; i++){
            s += 1.0f/i;
        }
        System.out.printf("%.2f\n", s);
    }

}

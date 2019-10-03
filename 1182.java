import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        float sum = 0f, avg = 0f;
        int i, j, arrayLength = 12;
        float[][] array = new float[arrayLength][arrayLength];
        int line = in.nextInt();
        String t = in.next();
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < arrayLength; j++) {
                array[i][j] = in.nextFloat();
            }
        }
        for (i = 0; i < arrayLength; i++) {
            sum += array[i][line];
        }
        avg = sum / arrayLength;
        if (t.equals("S")) {
            System.out.printf("%.1f\n", sum);
        } else if (t.equals("M")) {
            System.out.printf("%.1f\n", avg);
        }
    }
}

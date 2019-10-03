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
        if (t.equals("S")) {
            for (i = line; i <= line; i++) {
                for (j = 0; j < arrayLength; j++) {
                    sum += array[i][j];
                }
                System.out.println(sum);
            }
        } else if (t.equals("M")) {
            for (i = line; i <= line; i++) {
                for (j = 0; j < arrayLength; j++) {
                    avg += array[i][j];
                }
                System.out.println(avg / arrayLength);
            }
        }
    }
}
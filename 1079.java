import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        float[] f = new float[3];
        int n = in.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0;j<3;j++){
                f[j] = in.nextFloat();
            }
            float result = (((f[0] * 2) + (f[1] * 3) + (f[2] * 5)) / 10);
            System.out.printf("%.1f\n", result);
        }
    }
    
}

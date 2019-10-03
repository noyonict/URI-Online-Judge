import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x = in.nextInt();
        int y = in.nextInt();
        int j, k=1;
        while(k<=y){
            for (j = 1; j <= x; j++) {
                if(j!=x)
                    System.out.print(k+" ");
                else
                    System.out.print(k);
                k++;
            }
            System.out.println("");
        }
    }

}

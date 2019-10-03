import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int i, x, y;
        float div;
        int line = in.nextInt();
        for(i=0; i<line; i++){
            x = in.nextInt();
            y = in.nextInt();
            if(y!=0){
                div = (float)x/y;
                System.out.printf("%.1f\n", div);
            }else{
                System.out.println("divisao impossivel");
            }
        }
        
    }
}

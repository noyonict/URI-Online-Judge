import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int i, x, y, big, small, k, sum=0;
        int line = in.nextInt();
        for(i=0;i<line;i++){
            x = in.nextInt();
            y = in.nextInt();
            if(x>y){
                big = x;
                small = y;
            }else{
                big = y;
                small = x;
            }
            for(k=small+1; k<big; k++){
                if(k%2==1){
                    sum += k;
                }
            }
            System.out.println(sum);
            sum = 0;
        }
    }
}

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int i, x, y, big,k, small, sum=0;
        do{
            x = in.nextInt();
            y = in.nextInt();
            if(x>0 && y>0){
                if(x>y){
                    big = x;
                    small = y;
                }else{
                    big = y;
                    small = x;
                }
                for(k=small; k<=big; k++){
                    System.out.print(k+" ");
                    sum += k;
                }
                System.out.println("Sum="+sum);
                sum = 0;
            }
        }while(x>0 && y>0);
        
    }
}

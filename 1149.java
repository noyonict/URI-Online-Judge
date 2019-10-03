import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x = in.nextInt();
        int y, i, sum=0;
        do{
            y = in.nextInt();
            
        }while(y==0);
        for(i=x; i<x+y; i++){
            sum += i;
        }
        System.out.println(sum);
    }

}

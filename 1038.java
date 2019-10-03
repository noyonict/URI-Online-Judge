import java.util.Scanner;
//problem no: 1038
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        int Y = in.nextInt();
        switch(X){
            case 1:
                System.out.printf("Total: R$ %.2f\n",(Y*4.00));
                break;
            case 2:
                System.out.printf("Total: R$ %.2f\n",(Y*4.50));
                break;
            case 3:
                System.out.printf("Total: R$ %.2f\n",(Y*5.00));
                break;
            case 4:
                System.out.printf("Total: R$ %.2f\n",(Y*2.00));
                break;
            case 5:
                System.out.printf("Total: R$ %.2f\n",(Y*1.50));
                break;
        }
    }
}

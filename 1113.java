import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int x, y;
        do{
            x = in.nextInt();
            y = in.nextInt();
            if(x!=y){
                if(x>y){
                    System.out.println("Decrescente");
                }else{
                    System.out.println("Crescente");
                }
            }
        }while(x!=y);
        
    }
}

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int x, y;
        do{
            x = in.nextInt();
            y = in.nextInt();
            if(x>0 && y>0){
                System.out.println("primeiro");
            }else if(x>0 && y<0){
                System.out.println("quarto");
            }else if(x<0 && y<0){
                System.out.println("terceiro");
            }else if(x<0 && y>0){
                System.out.println("segundo");
            }
        }while(x!=0 && y!=0);
        
    }
}

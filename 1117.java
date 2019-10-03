import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static Main m = new Main();
    static float x, y;
    public static void main(String[] args) {
        m.firstResult();
        m.secondResult();
        float avg = (float)((x+y)/2);
        System.out.printf("media = %.2f\n", avg);
    }
    
    public void firstResult(){
        x = in.nextFloat();
        if(x<0 || x>10){
            System.out.println("nota invalida");
            
            firstResult();

        }
    }
    
    public void secondResult(){
        y = in.nextFloat();
        if(y<0 || y>10){
            System.out.println("nota invalida");
            secondResult();
        }
    }
}

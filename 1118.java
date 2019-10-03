import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static Main m = new Main();
    static float x, y;
    public static void main(String[] args) {
       m.resultCal();
    }
    
    public void resultCal(){
        m.firstResult();
        m.secondResult();
        float avg = (float)((x+y)/2);
        System.out.printf("media = %.2f\n", avg);
        m.doAgani();
    }
    
    public void doAgani(){
        int X;
        System.out.println("novo calculo (1-sim 2-nao)");
        X = in.nextInt();
        switch(X){
            case 1:
                x = 0;
                y=0;
                m.resultCal();
                break;
            case 2:
                break;
            default:
                m.doAgani();
        }
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

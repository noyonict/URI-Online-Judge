import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        int i, Coelho=0, Rato=0, Sapo=0;
        int numberOfTest = in.nextInt();
        for(i=0; i < numberOfTest; i++){
            int number = in.nextInt();
            String c = in.next();
            switch(c){
                case "C":
                    Coelho += number;
                    break;
                case "R":
                    Rato += number;
                    break;
                case "S":
                    Sapo += number;
            }
        }
        int total = Coelho+Rato+Sapo;
        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + Coelho);
        System.out.println("Total de ratos: " + Rato);
        System.out.println("Total de sapos: " + Sapo);
        float per = (float)((Coelho * 100.00)/total);
        System.out.printf("Percentual de coelhos: %.2f %%\n", per);
        per = (float)((Rato*100.00)/total);
        System.out.printf("Percentual de ratos: %.2f %%\n", per);
        per = (float)((Sapo*100.00)/total);
        System.out.printf("Percentual de sapos: %.2f %%\n", per);
    }
    
}

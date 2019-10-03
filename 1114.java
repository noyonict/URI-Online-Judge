import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int x=2002, pass;
        do{
            pass = in.nextInt();
            if(pass != x)
                System.out.println("Senha Invalida");
            else
                System.out.println("Acesso Permitido");
        }while(pass!=2002);
        
    }
}

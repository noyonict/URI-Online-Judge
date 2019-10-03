import java.util.Scanner;
//problem no: 1046

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int end = in.nextInt();
        int duration;
        if(start>end){
            duration = 24 - start + end;
        }else if(start == end){
            duration = 24;
        }else{
            duration = end - start;
        }
        System.out.printf("O JOGO DUROU %d HORA(S)\n",duration);
    }
}

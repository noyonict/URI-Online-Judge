import java.util.Scanner;
//problem no: 1047

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int startHourse = in.nextInt();
        int startMinute = in.nextInt();

        int endHourse = in.nextInt();
        int endMinute = in.nextInt();

        int durationHoure, durationMinute;
        if(startHourse>endHourse){
            durationHoure = 24 - startHourse + endHourse;
        }else if(startHourse == endHourse){
            durationHoure = 24;
        }else{
            durationHoure = endHourse - startHourse;
        }

        if(startMinute > endMinute){
            durationMinute = 60 - (startMinute - endMinute);
            durationHoure--;
        }else if(startMinute == endMinute){
            durationMinute = 0;
        }else{
            durationMinute = endMinute - startMinute;
        }
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",durationHoure,durationMinute);
    }
}
// problem no: 1070
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int oddNumber = in.nextInt();
        int count = 0;
        for(int i=oddNumber;i<=oddNumber+12 && count<6; i++){
            if(i%2!=0){
                System.out.println(i);
                count++;
            }
        }
    }
}
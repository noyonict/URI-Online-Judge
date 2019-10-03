// problem no: 1067
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int oddNumber = in.nextInt();
        for(int i=1;i<=oddNumber; i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}

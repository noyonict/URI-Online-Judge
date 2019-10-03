import java.util.Scanner;
//problem no: 1060

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Float number[] = new Float[6];
        int count=0;
        for(int i=0; i<number.length; i++){
            number[i] = in.nextFloat();
        }
        for(int i =0; i<number.length; i++){
            if(number[i] > 0){
                count++;
            }
        }
        System.out.println(count+" valores positivos");
    }
}

import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int size = in.nextInt();
        int i, smaller = 0, indexPosition = 0;
        int array[] = new int[size];
        for(i=0; i < array.length; i++){
            array[i] = in.nextInt();
            if(i == 0)
                smaller = array[0];
            if(smaller > array[i]){
                smaller = array[i];
                indexPosition = i;
            }
        }
        System.out.println("Menor valor: " + smaller);
        System.out.println("Posicao: " + indexPosition);
        
    }

}

public class Main {
    public static void main(String[] args) {
        int i, k, j=7;
        for(i=1; i <= 9; i+=2){
            for(k=1; k<=3; k++){
                System.out.println("I="+i+" J="+j);
                j--;
            }
            j += 5;
        }
    }
}
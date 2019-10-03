public class Main {
    public static void main(String[] args) {
         float i, j;
        for(i=0; i <=2.00001; i+= .2){
            for(j=1; j<=3; j++){
                if(i==0 || i==1 || i>=2){
                    int k = (int)i;
                    int l = (int)(i+j);
                    System.out.println("I="+k+" J="+l);
                }else{
                    System.out.printf("I=%.1f J=%.1f\n", i, (j+i));
                }
                
            }
        }
    }
}

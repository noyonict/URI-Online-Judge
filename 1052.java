import java.util.Scanner;
//problem no: 1052

public class Main {
  
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        String mName = "";
        switch(month){
            case 1: 
                mName = "January";
                break;
            case 2:
                mName = "February";
                break;
            case 3:
                mName = "March";
                break;
            case 4:
                mName = "April";
                break;
            case 5:
                mName = "May";
                break;
            case 6:
                mName = "June";
                break;
            case 7:
                mName = "July";
                break;
            case 8:
                mName = "August";
                break;
            case 9:
                mName = "September";
                break;
            case 10:
                mName = "October";
                break;
            case 11:
                mName = "November";
                break;
            case 12:
                mName = "December";
                break;
            
        }
        System.out.println(mName);
    }
}

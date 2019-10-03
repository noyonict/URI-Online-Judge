import java.util.Scanner;
//problem no: 1048

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        float salary = in.nextFloat();
        float per = 0;
        int inPer = 0;
        float totalSalary = 0;
        if(salary>0 && salary <= 400.00){
            per = (salary * 15)/100;
            totalSalary  = per + salary;
            inPer = 15;
        }else if(salary>400.00 && salary <= 800.00){
            per = (salary * 12)/100;
            totalSalary  = per + salary;
            inPer = 12;
        }else if(salary>800.00 && salary <= 1200.00){
            per = (salary * 10)/100;
            totalSalary  = per + salary;
            inPer = 10;
        }else if(salary>1200.00 && salary <= 2000.00){
            per = (salary * 7)/100;
            totalSalary  = per + salary;
            inPer = 7;
        }else if(salary>2000.00){
            per = (salary * 4)/100;
            totalSalary  = per + salary;
            inPer = 4;
        }
        System.out.printf("Novo salario: %.2f\n", totalSalary);
        System.out.printf("Reajuste ganho: %.2f\n", per);
        System.out.println("Em percentual: "+inPer+" %");
    }
}

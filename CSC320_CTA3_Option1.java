import java.util.Scanner;

public class CSC320_CTA3_Option1{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("How much do you make per week? ");
        Double weekSal = sc.nextDouble();
        Integer taxRate;
        Double salaryTax;

        if (weekSal < 500 ){
            taxRate = 10;
            salaryTax = (weekSal * .1);      
        }
        else if (weekSal >= 500 && weekSal < 1500) {
            taxRate = 15;
            salaryTax = (weekSal * .15);      
        }
        else if (weekSal >= 1500 && weekSal < 2500) {
            taxRate = 20;
            salaryTax = (weekSal * .2);      
        }else {
            taxRate = 30;
            salaryTax = (weekSal * .3);      
        }
        System.out.println("Your weekly salary is " + weekSal + " So your tax rate is "
         + taxRate + "%" +  " so you would pay " + salaryTax);
         sc.close();
    }
}
import java.util.Scanner;

public class CSC320_CTA4_Option2 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        float maxGrade = 0;
        float minGrade = 100;
        String grade;    
        float sum = 0;    
        float avg = 0;
        Float val;

        for (int i = 0; i < 10; i++) {
            try{
            System.out.println("Student #" + (i+1) + " Please input your grade: ");

            grade = sc.next();
            val = Float.parseFloat(grade);

            if (val > 100 || val < 0){
                val = null;
                i--;
                System.out.println("The grade can only be between 0-100% please enter a valid grade.");
            }
            if (val > maxGrade && val <= 100) {
                maxGrade = val;
            }
            if (val < minGrade && val >= 0) {
                minGrade = val;
            }
            sum = sum + val;
            avg = sum / (i + 1);
            }catch (NumberFormatException e) {
                System.out.println("Use numbers only please");
                i--;   
            }catch (NullPointerException e) {
                System.out.println("");
            }
     }  
        System.out.println("The average grade is " + avg);
        System.out.println("The lowest grade is " + minGrade);
        System.out.println( "The highest grade is " + maxGrade);
        System.out.println("");

                sc.close();
        }
    }

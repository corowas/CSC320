import java.util.Scanner;

public class TTest {
    public static void main(String args[]){
        

        Scanner sc = new Scanner(System.in);
        float maxGrade = 0;
        float minGrade = 100;
        String grade;    
        float sum = 0;    
        float avg = 0;

        for (int i = 0; i < 10; i++) {
            try{
            System.out.println("Student #" + (i+1) + " Please input your grade: ");

            grade = sc.next();
            float val = Float.parseFloat(grade);

            if (val > 100 || val < 0){
                val = 0;
                i--;
                System.out.println("The grade can only be between 0-100% please enter a valid grade.");
            }
            if (val > maxGrade) {
                maxGrade = val;
            }
            if (val < minGrade) {
                minGrade = val;
            }
            sum = sum + val;
            avg = sum / (i + 1);
            
            }catch (NumberFormatException e) {
                System.out.println("Use numbers only please");
                i--;
                
            }

     }
                
        System.out.println("The average grade is " + avg);
        System.out.println("The lowest grade is " + minGrade);
        System.out.println( "The highest grade is " + maxGrade);
        System.out.println("");


                sc.close();
        }
    }

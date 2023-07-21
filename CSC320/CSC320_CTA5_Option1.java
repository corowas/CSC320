package CSC320;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CSC320_CTA5_Option1 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String[] daysArray = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int[] tempArray = new int[7];
        String val;
        int temp;
        int sum = 0;
        int avg = 0;
        int i = 0;

        for (int n = 0; n <= daysArray.length -1; n++) {
            try{
            System.out.println("How hot was it on " + daysArray[n]);
            val = sc.next();
            temp = Integer.parseInt(val);
            tempArray[n] = temp;
           
            sum = sum + temp;
            avg = sum / (n + 1);
            }catch (NumberFormatException e) {
                System.out.println("Use whole numbers only please");
                n--; 
                System.out.println("");

            }catch(InputMismatchException e) {
                System.out.println(("input numbers only please"));
                n--; 
                System.out.println("");
            // }catch (NullPointerException e) {
            //     System.out.println("Please input something");
            //     System.out.println("");
            //     n--;
            }
     }  
    System.out.println("The weekly temps were: ");

     while (i <= daysArray.length - 1){
        System.out.println(daysArray[i] + " " + tempArray[i]);
        System.out.println("");
        i++;
     }
        System.out.println("");
        System.out.println("The average temperature for the week was " + avg);
        System.out.println("");
                sc.close();
        }
    }

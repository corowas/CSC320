package CTA5;
import java.util.Scanner;

public class ProductCalculator {

    public static void productCalculator(int userInput, int i, int sum) {
        Scanner sc = new Scanner(System.in);
        i++;
        if (i > 5) {    //once there is 5 inputs the program will stop print this and end
            // System.out.println("checking base method");
            System.out.println("\nThe sum of the 5 numbers you input is: " + sum);
            
        } else if (i <= 5){     //before there are 5 entries this will be called
            System.out.print(i + ": "); // chcecking value of i and
            System.out.println("Enter a whole number: ");
            userInput = sc.nextInt();
            sum+= userInput;

            productCalculator(userInput, i, sum);       //recursion statement here
        }
        sc.close();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int i = 0;
        int userInput = 0;
               
        productCalculator(userInput, i, sum);
             
        sc.close();
    }
} 

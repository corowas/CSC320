package portfolioProj;
import java.util.InputMismatchException;
import java.util.Scanner;


public class CSC320PortfolioProj {
    
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Automobile newCar = new Automobile();

    int x = -1;
    
    do {
       try { 
        System.out.println("Enter your Selection: \n"
        + "1: Add new Car\n" 
        + "2: View Inventory\n"
        + "3: Delete Car\n"
        + "4: Edit Inventory\n"
        + "5: Print to File\n"
        + "0: Exit Program"); 
        x = sc.nextInt();
       
            if (x == 1) {    
            newCar.setCarInfo();
            System.out.println("\n*** Vehicle Added Successfully ***\n");
            System.out.println(newCar.concat());
            newCar.addCar(newCar.concat());

            } else if (x == 2) {
                newCar.viewInv();
            } else if (x == 3) {
                System.out.println("Input the number you want to be removed:");
                int userInp = sc.nextInt();
                newCar.removeCar(userInp);
            } else if (x == 4) {
                System.out.println("Input the number you want to edit:");
                int userInp = sc.nextInt();
                newCar.setCar(userInp);
            }else if (x == 5) {
                System.out.println("Would you like to print to a file? Y/N");
                String c = sc.next();
                newCar.writer(c);
                System.out.println("***Successfully printed to file 'Vehicle.txt'***");
                
            }else if (x == 0) {
                System.out.println("Ending program now....");
            }
            }catch (NumberFormatException e) {
             System.out.println("Use numbers only please");   
            }catch (InputMismatchException e) {
                System.out.println("Error: the input was not the correct type, please try again.");
                sc.next(); 
                x = sc.nextInt();     
            }
            } while (x != 0);

            sc.close();
    }
}


package CSC372.CTA1;
import java.util.Scanner;
import java.util.ArrayList;

public class BankAccount {
    protected String firstName;
    protected String lastName;
    protected int accountID;
    protected double balance = 2f;
    int userInput;
    int random_int;

    Scanner sc = new Scanner(System.in);

    public void generateRandom() {
        
          int min = 10000; // Minimum value of range
          int max = 99999; // Maximum value of range
          // Generate random int value from min to max
          random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
          // Printing the generated random numbers
        }
    public void setName() {
        System.out.println("please enter your first name");
        firstName = sc.next(); 
        System.out.println("please enter your last name");
        lastName = sc.next();
        setAccountNum();
    }
    public String getName() {
        return firstName + " " + lastName;
    }
    public void setAccountNum() {
        generateRandom();
        accountID = random_int;
    }
    public void constructor() {
        balance = 0;
    }
    public String concat() {
        String actSum = getName() + ", ID: " +  accountID +", total balace:  " +  balance; 
        return actSum;
    }
    public void accountSummary() {
        ArrayList<String> accountSummary = new ArrayList<String>();
        constructor();
        accountSummary.add(concat());
        System.out.println("New Account\n" + concat() + "\nSuccessfully added!");
    }
     public void deposit(double deposit) { //add money to balance
       
        balance = balance + deposit;
    }
    public void withdraw(double withdraw ) { //subtract money from acct
        balance = balance - withdraw;
    }
    public double getBalance() {
        System.out.printf("Your current balance is %.2f",balance);
        return balance;
    }
    public void accountActions() {

        do{ //calls what action to do with account balance
        System.out.println("\nEnter 1 for deposit\nEnter 2 for withdraw\nEnter 3 for balance\nEnter 0 to Exit");
        userInput = sc.nextInt();

        if (userInput == 1) {
             System.out.println("how much would you like to deposit: ");
            double depositAmount = sc.nextDouble();
            deposit(depositAmount);
        } else if (userInput == 2) {
            System.out.println("how much would you like to withdraw: ");
            double wdAmount = sc.nextDouble();
            withdraw(wdAmount);
        } else if (userInput == 3) {
            System.out.println();
            System.out.print("Balance: ");
            getBalance();
        }else {
            System.out.println("See you soon");
        }
    } while(userInput != 0);
    }
   
}

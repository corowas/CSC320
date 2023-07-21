package CSC372.CTA1;
import java.util.Scanner;
import java.util.ArrayList;

public class BankAccount {
    private String firstName;
    private String lastName;
    private int accountID;
    protected double balance;
    int userInput;

    Scanner sc = new Scanner(System.in);


    public void setName() {
        System.out.println("please enter your first name");
        firstName = sc.next(); 
        System.out.println("please enter your last name");
        lastName = sc.next();
    }
    public void setAccountNum() {
        accountID = sc.nextInt();
    }
    public void constructor() {
        balance = 0;
    }
    public String concat() {
        String actSum = firstName + " " + lastName + ": " +  accountID +", total balace:  " +  balance; 
        return actSum;
    }
    public void displayAccount() {
        System.out.println(concat());
    }
    public void accountSummary() {
        ArrayList<String> accountSummary = new ArrayList<String>();
        constructor();
        accountSummary.add(concat());
        System.out.println(concat() + " has been successfully added");
    }
     public void deposit() { //add money to balance
        System.out.println("how much would you like to deposit: ");
        double deposit = sc.nextDouble();
        balance = balance + deposit;
    }
    public void withdraw() { //subtract money from acct
        System.out.println("how much would you like to withdraw: ");
        double withdraw = sc.nextDouble();
        balance = balance - withdraw;

            if (balance < 0) { //overdraft fee
                balance = balance - 30;
                System.out.println("You have overdrafted your account so there was a $30 fee added");
                System.out.println("current balance: " + getBalance() + "\n");
            }
    }
    public double getBalance() {
        System.out.println(balance);
        return balance;
    }
    public void accountActions() {

        do{ //calls what action to do with account balance
        System.out.println("\nEnter 1 for deposit\n Enter 2 for withdraw\n Enter 3 for balance\n Enter 0 to Exit");
        userInput = sc.nextInt();

        if (userInput == 1) {
            deposit();
        } else if (userInput == 2) {
            withdraw();
        } else if (userInput == 3) {
            getBalance();
        }else {
            System.out.println("See you soon");
        }
    } while(userInput != 0);
    }
   
}

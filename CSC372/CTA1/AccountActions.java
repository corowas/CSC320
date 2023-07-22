// package CSC372.CTA1;
// import java.util.Scanner;

// public class AccountActions {
//     Scanner sc = new Scanner(System.in);
//     double balance;
//     int userInput;
//     public void deposit(double deposit) { //add money to balance
       
//         balance = balance + deposit;
//     }
//     public void withdraw(double withdraw ) { //subtract money from acct
//         balance = balance - withdraw;
//     }
//     public void accountActions() {

//         do{ //calls what action to do with account balance
//         System.out.println("\nEnter 1 for deposit\nEnter 2 for withdraw\nEnter 3 for balance\nEnter 0 to Exit");
//         userInput = sc.nextInt();

//         if (userInput == 1) {
//              System.out.println("how much would you like to deposit: ");
//             float depositAmount = sc.nextFloat();
//             deposit(depositAmount);
//         } else if (userInput == 2) {
//             System.out.println("how much would you like to withdraw: ");
//             float wdAmount = sc.nextFloat();
//             withdraw(wdAmount);
//         } else if (userInput == 3) {
//             System.out.println();
//             System.out.print("Balance: ");
//             getBalance();
//         }else {
//             System.out.println("See you soon");
//         }
//     } while(userInput != 0);
//     }
// }
package CSC372.CTA1;

public class CheckingAccount extends BankAccount {
    String accountType;
    double interestRate;

    public void accountClass() {
        accountType = "Checking";
    }
    public void setName() {
        super.setName();
        accountClass();
    }
    public void setAccountNum() {
        super.setAccountNum();
        setInterestRate();
    }

    public void displayAccount() {
    System.out.println(concat());
    }

    public String processWithdrawal() {
        if (balance < 0) { //overdraft fee
            balance = balance - 30;
            System.out.println("You have overdrafted your account so there was a $30 fee added");
            getBalance();
            return "Please add more money";
        }
        return "Thank you for your time!";
    }
    public double getBalance() {
        super.getBalance();
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
                processWithdrawal();
            } else if (userInput == 3) {
                System.out.println();
                System.out.print("Balance: ");
                getBalance();
            }else {
                System.out.println("See you soon");
            }
    } while(userInput != 0);
    }
    public void setInterestRate() {
        interestRate = .05;
    }
        public String concat() {
            String actSum = super.getName() + " " + accountType + " Account #: " +  accountID +", total balace:  "
            +  balance + " your interest rate is: " + (interestRate * 100) + "%"; 
            return actSum;
    }
}

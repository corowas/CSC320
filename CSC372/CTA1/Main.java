package CSC372.CTA1;

public class Main {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();        
        b1.setName();
        System.out.println("please enter your num");
        b1.setAccountNum();
        b1.accountSummary();
        b1.accountActions();
        b1.displayAccount();
    }
}

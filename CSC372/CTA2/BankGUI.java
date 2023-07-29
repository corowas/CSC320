package CTA2;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// import java.text.NumberFormat;



public class BankGUI extends JFrame implements ActionListener {
    private JButton displayButton;            // Triggers amount in account
    private JButton depositButton;            // Triggers deposit actions
    private JButton withdrawButton;           // Triggers Withdraw actions
    private JLabel amountLabel;   
    private JLabel balanceLabel;               // Label for 
    private JFormattedTextField amountField;
    private JTextField balanceField; // Holds distance input
    private double balance;

    BankGUI() {
       

        GridBagConstraints layoutConstraints = null;
        setTitle("Bank App");   //Set title of Frame

        amountLabel = new JLabel("Enter Amount"); //Label for the input to be used for deposit/withdraw
        balanceLabel = new JLabel("Balance is: ");

        // NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        amountField = new JFormattedTextField();
        amountField.setEditable(true);
        amountField.setPreferredSize(new Dimension(200, 20));
        
        balanceField = new JTextField(Double.toString(balance));
        balanceField.setEditable(false);
        balanceField.setPreferredSize(new Dimension(200, 20));

        displayButton = new JButton("Display Balance");     //displays the account balance
        displayButton.addActionListener(this);

        depositButton = new JButton("Deposit Amount above");      //adds the amount to balance
        depositButton.addActionListener(this);

        withdrawButton = new JButton("Withdraw Amount above");      //subtracts the amount from balance
        withdrawButton.addActionListener(this);

        setLayout(new GridBagLayout());

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.insets = new Insets(10, 10, 10, 1);
        layoutConstraints.gridx = 0;
        layoutConstraints.gridy = 0;
        add(amountLabel, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.insets = new Insets(1, 0, 10, 10);
        layoutConstraints.gridx = 1;
        layoutConstraints.gridy = 0;
        add(amountField, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.insets = new Insets(1, 0, 10, 10);
        layoutConstraints.gridx = 1;
        layoutConstraints.gridy = 1;
        add(balanceField, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.insets = new Insets(10, 10, 10, 1);
        layoutConstraints.gridx = 0;
        layoutConstraints.gridy = 1;
        add(balanceLabel, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.insets = new Insets(10, 5, 10, 10);
        layoutConstraints.gridx = 0;
        layoutConstraints.gridy = 2;
        add(displayButton, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.insets = new Insets(10, 5, 10, 10);
        layoutConstraints.gridx = 1;
        layoutConstraints.gridy = 2;
        add(depositButton, layoutConstraints);

        layoutConstraints = new GridBagConstraints();
        layoutConstraints.insets = new Insets(10, 5, 10, 10);
        layoutConstraints.gridx = 2;
        layoutConstraints.gridy = 2;
        add(withdrawButton, layoutConstraints);
    }
    @Override
    public void actionPerformed(ActionEvent event) {
        double userInput = 0;
        balance = 500.25;
        userInput = ((Number) amountField.getValue()).doubleValue();

        Object valueObj = amountField.getValue();
    if (valueObj instanceof Number) {
        userInput = ((Number) valueObj).doubleValue();
         
        if (event.getSource() == displayButton) {
            balanceField.setText(String.format("%.2f", balance));
        } else if (event.getSource() == depositButton) {
            balance += userInput;

        } else if (event.getSource() == withdrawButton) {
            balance -= userInput;
        }
    } else {
        // Handle the case when the input is invalid (null or not a number)
        // For example, you can show an error message or set a default value.
        System.out.println("Invalid input!");
        return; // Exit the method as there's nothing to update
    }

       
        balanceField.setText(String.format("%.2f", balance));
    }
    public static void main(String[] args) {
        BankGUI bankOne = new BankGUI();
        bankOne.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bankOne.pack();
        bankOne.setVisible(true);
    }
}

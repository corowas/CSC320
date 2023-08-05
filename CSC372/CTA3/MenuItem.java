package CTA3;
import javax.swing.*;
import java.awt.event.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Date;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class MenuItem extends JFrame implements ActionListener{
    JPanel displayPanel;
    JPanel datePanel;
    JPanel colorPanel;
    JMenuBar menuBar;    
    JMenu mainMenu;    
    JMenuItem dateMenu,textMenu,colorMenu,exitMenu;    
    JTextField colorField;    
    JFormattedTextField today;
    JLabel todayLabel;
    JLabel colorLabel;
    DateFormat dateFormat;
    BufferedOutputStream outS;
    String printToday;
    
    MenuItem(){
        GridBagConstraints layoutConstraints = null;
        setTitle("Critical Thinking Assignment 3");
        dateMenu = new JMenuItem("Get Date");
        dateMenu.addActionListener(this);
        textMenu = new JMenuItem("Send Text");
        textMenu.addActionListener(this);
        colorMenu = new JMenuItem("Change Color");
        colorMenu.addActionListener(this);
        exitMenu = new JMenuItem("Exit");
        exitMenu.addActionListener(this);

        displayPanel = new JPanel(new BorderLayout());
        datePanel = new JPanel(new BorderLayout());

        dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        today = new JFormattedTextField(dateFormat);
        today.setName("Today");
        today.setText("Select 'Get Date' From Menu");
        today.setColumns(20);
        today.setEditable(false);
        todayLabel = new JLabel("Date:");
        todayLabel.setLabelFor(today);
        today.setVisible(true);
        datePanel.add(today,BorderLayout.EAST);
        datePanel.add(todayLabel,BorderLayout.WEST);
        displayPanel.add(datePanel, BorderLayout.CENTER);
        displayPanel.setVisible(true);

        colorPanel = new JPanel(new BorderLayout());
        colorField = new JTextField("Select 'Change Color' From Menu");
        colorLabel = new JLabel("Color:");
        colorLabel.setLabelFor(colorField);
        colorField.setVisible(true);
        colorField.setEditable(false);
        colorField.setColumns(20);
        colorPanel.add(colorField, BorderLayout.EAST);
        colorPanel.add(colorLabel,BorderLayout.WEST);
        displayPanel.add(colorPanel,BorderLayout.SOUTH);

        mainMenu = new JMenu("Main Menu");
        mainMenu.add(dateMenu);mainMenu.add(textMenu);mainMenu.add(colorMenu);mainMenu.add(exitMenu);

        menuBar = new JMenuBar();
        menuBar.add(mainMenu);
        menuBar.setSize(20,10);
        setJMenuBar(menuBar);
        menuBar.setVisible(true); 

        setLayout(new GridBagLayout());

        layoutConstraints = new GridBagConstraints(); //amount label
        layoutConstraints.insets = new Insets(10, 10, 10, 1);
        layoutConstraints.gridx = 0;
        layoutConstraints.gridy = 0;
        add(displayPanel, layoutConstraints);


        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(238,238,238));
  
        
    }
    @Override
        public void actionPerformed(ActionEvent e){
            File myFile = new File("/Applications/Python 3.9/codes/Java/CSC372/CTA3/log.txt");


            if (e.getSource() == dateMenu) {
                today.setValue(new Date());
                printToday = today.getText();


            } else if (e.getSource() == textMenu) {
                try( FileWriter myWriter = new FileWriter(myFile, true);
                    BufferedWriter bw = new BufferedWriter(myWriter)){
                    bw.append(printToday);
                    bw.newLine();
                }
                    catch (FileNotFoundException ea) {
                        System.out.println("file not found");
                 }catch (IOException ea) {
                    System.out.println("unable to write to file");
                 }
                 System.out.println("Success");
                } else if(e.getSource() == colorMenu) {
                    int r = (int)(Math.random() * 100);
                    int g = (int)((Math.random() * 100) + 155);
                    int b = (int)(Math.random() * 100);
                    getContentPane().setBackground(new Color(r,g,b));
                    
                    colorField.setText("r: " + r + ", g: " + g + ", b: " + b);
                } else if (e.getSource() == exitMenu) {
                    System.exit(0);
                }

        }
    
    public static void main(String[] args) {
        MenuItem ex = new MenuItem();
        ex.pack();
        ex.setVisible(true);
        ex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

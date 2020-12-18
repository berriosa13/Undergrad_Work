package form;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CreateTwoGUI_Apps {
    private JTextField firstNameTextField;
    private JTextField lastNameTextField;
    private JPanel mainPanel;
    private JTextField totalAmountOfDeductionsTextField;
    private JComboBox numDependants;
    private JRadioButton marriedFilingJointlyRadioButton;
    private JRadioButton marriedFilingSeparatelyRadioButton;
    private JRadioButton singleRadioButton;
    private JRadioButton headOfHouseholdRadioButton;
    private JTextField taxAmountOwedTextField;
    private JRadioButton refundRadioButton;
    private JRadioButton oweRadioButton;
    private JButton clearFieldsButton;
    private JButton exitButton;
    private JButton calculateButton;
    private JFormattedTextField ftfCharity;
    private JFormattedTextField ftfTaxesPaid;
    private JPasswordField pfSSN;
    private JTextField tbGrossIncome;
    private int grossIncome;
    private int dependants;
    private int AGI;
    private int deductions;
    private int charitableContributions;
    private double taxRate;
    private int taxCalculated;
    private int taxPaid;
    private int totalRefund;
    private int totalOwe;

    public CreateTwoGUI_Apps() {

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // Creates pop-up window asking if user wishes to close program
                int input = JOptionPane.showConfirmDialog(null, "Are you sure you want to EXIT?");
                // Closes program if user selects "Yes" on pop-up window
                System.out.println(input);
                if (input == 0) {
                    System.exit(0);
                }

            }
        });

        clearFieldsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                firstNameTextField.setText("");
                lastNameTextField.setText("");
                pfSSN.setText("");
                tbGrossIncome.setText("");
                totalAmountOfDeductionsTextField.setText("");
                numDependants.setSelectedItem(null);
                ftfCharity.setText("");
                ftfTaxesPaid.setText("");
                taxAmountOwedTextField.setText("");
                refundRadioButton.setSelected(false);
                oweRadioButton.setSelected(false);
                oweRadioButton.setText("Owe");
                refundRadioButton.setText("Refund");
                marriedFilingSeparatelyRadioButton.setSelected(false);
                marriedFilingJointlyRadioButton.setSelected(false);
                singleRadioButton.setSelected(false);
                headOfHouseholdRadioButton.setSelected(false);
            }
        });

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // AGI calculation
                AGI = grossIncome - (dependants * 4000) - deductions - charitableContributions;
                // Sets AGI to 0 if AGI calculation is less than 0
                if (AGI < 0)
                    AGI = 0;
                // Calculates taxCalculated by multiplying the AGI by the taxRate
                taxCalculated = (int) (AGI * taxRate);
                // Sets two variables to display the amounts of money to be refunded or owed
                totalRefund = taxPaid - taxCalculated;
                totalOwe = taxCalculated - taxPaid;
                // Conditional statements to determine whether user owes taxes or should be refunded
                if(taxPaid > taxCalculated) {
                    refundRadioButton.setSelected(true);
                    taxAmountOwedTextField.setText("Total tax refund is $" + totalRefund);
                    taxAmountOwedTextField.setForeground(Color.GREEN);
                }
                if (taxPaid < taxCalculated) {
                    oweRadioButton.setSelected(true);
                    taxAmountOwedTextField.setText("Total tax owed is $"+ totalOwe);
                    taxAmountOwedTextField.setForeground(Color.RED);
                }
            }
        });
        firstNameTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String fn;
                fn = firstNameTextField.getText();  // Stores user first name input for possible use later
            }
        });
        lastNameTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
            String ln;
            ln = lastNameTextField.getText(); // Stores user last name input for possible use later
                
            }
        });
        // Takes the grossIncome as a string and parses to an
        // int to be calculated later
        tbGrossIncome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
            grossIncome = Integer.parseInt(tbGrossIncome.getText());
            }
        });
       // Takes user deductions amount as a string and parses
        // it into an int to be calculated later
        totalAmountOfDeductionsTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                deductions = Integer.parseInt(totalAmountOfDeductionsTextField.getText());
            }
        });
        // Takes user charity amount as a String and parses
        // to an int so it can be calculated later
        ftfCharity.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                charitableContributions = Integer.parseInt(ftfCharity.getText());
            }
        });
        // Sets the selected index values to the corresponding
        // number of dependents the user selects
        numDependants.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (numDependants.getSelectedItem() == numDependants.getItemAt(1)) {
                    dependants = 0;
                }
                if (numDependants.getSelectedItem() == numDependants.getItemAt(2)) {
                    dependants = 1;
                }
                if (numDependants.getSelectedItem() == numDependants.getItemAt(3)) {
                    dependants = 2;
                }
                if (numDependants.getSelectedItem() == numDependants.getItemAt(4)) {
                    dependants = 3;
                }
                if (numDependants.getSelectedItem() == numDependants.getItemAt(5)) {
                    dependants = 4;
                }
                if (numDependants.getSelectedItem() == numDependants.getItemAt(6)) {
                    dependants = 5;
                }
                if (numDependants.getSelectedItem() == numDependants.getItemAt(7)) {
                    dependants = 6;
                }
                if (numDependants.getSelectedItem() == numDependants.getItemAt(8)) {
                    dependants = 7;
                }
                if (numDependants.getSelectedItem() == numDependants.getItemAt(9)) {
                    dependants = 8;
                }
                if (numDependants.getSelectedItem() == numDependants.getItemAt(10)) {
                    dependants = 9;
                }
            }
        });
        // The next four radioButton action listeners set the taxRate
        // to a specific value depending on which radioButton is click. The action listeners
        // unchecks the rest of the radioButtons if another is clicked to avoid multiple
        // clicked buttons.
        marriedFilingJointlyRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                taxRate = .22;  // sets taxRate value
                marriedFilingSeparatelyRadioButton.setSelected(false);
                singleRadioButton.setSelected(false);
                headOfHouseholdRadioButton.setSelected(false);
            }
        });
        marriedFilingSeparatelyRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                taxRate = .18;  // sets taxRate value
                marriedFilingJointlyRadioButton.setSelected(false);
                singleRadioButton.setSelected(false);
                headOfHouseholdRadioButton.setSelected(false);
            }
        });
        singleRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                taxRate = .20; // sets taxRate value
                marriedFilingJointlyRadioButton.setSelected(false);
                marriedFilingSeparatelyRadioButton.setSelected(false);
                headOfHouseholdRadioButton.setSelected(false);
            }
        });
        headOfHouseholdRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                taxRate =  .15; // sets taxRate value
                marriedFilingSeparatelyRadioButton.setSelected(false);
                marriedFilingJointlyRadioButton.setSelected(false);
                singleRadioButton.setSelected(false);

            }
        });
        ftfTaxesPaid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                taxPaid = Integer.parseInt(ftfTaxesPaid.getText());

            }
        });

        // The next next four KeyListeners all prevent the user
        // from entering any non numerical values by using the consume() method
        tbGrossIncome.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                char c = e.getKeyChar();
                if (!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
                    e.consume();
                }
            }
        });
        totalAmountOfDeductionsTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                char c = e.getKeyChar();
                if (!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE))
                    e.consume();

            }
        });
        ftfCharity.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                char c = e.getKeyChar();
                if (!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE))
                    e.consume();
            }
        });
        ftfTaxesPaid.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                char c = e.getKeyChar();
                if (!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE))
                    e.consume();
            }
        });
        tbGrossIncome.addKeyListener(new KeyAdapter() {
        });
    /*
        if (!firstNameTextField.getText().equals("") && !lastNameTextField.getText().equals("")
                && !tbGrossIncome.getText().equals("") && !totalAmountOfDeductionsTextField.getText().equals("")
                && !ftfCharity.getText().equals("") && !ftfTaxesPaid.getText().equals("")
        )
            calculateButton.setEnabled(true);
        else
            calculateButton.setEnabled(false);
        */
    }
    // main
    public static void main(String[] args) {
        JFrame frame = new JFrame("Anthony's Window");
        frame.setContentPane(new CreateTwoGUI_Apps().mainPanel);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(700,500));
        frame.setVisible(true);

    }
}

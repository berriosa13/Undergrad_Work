 /*
    Name:         Anthony Berrios
    Date:         11/27/18
    Title:        ATMgui.java
    Description:  An example GUI program using the JavaFX framework
    */
    
    import javafx.application.*;
    import javafx.stage.*;
    import javafx.scene.*;
    import javafx.scene.control.*;
    import javafx.scene.layout.*;
    import javafx.event.*;
    import javafx.geometry.*;
    
    public class ATMgui extends Application  {
    
        // global controls and references
        static BankAccount bank;
        Label currentBalanceLabel;
        TextField depositTextField;
        TextField withdrawTextField;
    
        // "launch" method is called 
        // "launch()"" is defined in javafx.application.Application.java 
        // meaning of "extends" keyword is covered in CSC240
        public static void main(String[] args) {
            // create a new BankAccount object with an empty balance
            bank = new BankAccount();
    
            launch(args);
        }
    
        // "start" method is automatically called by "launch()" method
        // everything begins here
        // similar to how "public static void main" works
        public void start (Stage s) {
            // 1. create the Control objects
            // note that globals are declared outside of "start" method
            Label bankLabel = new Label("Current bank balance:");
            currentBalanceLabel = new Label(String.valueOf(bank.getBalance()));  
                                           // NOTE: String.valueOf(double) is a double->String conversion
            Label depositLabel = new Label("Enter deposit amount:");
            depositTextField = new TextField();
            Button depButton = new Button("Make Deposit");
            
            Label withdrawLabel= new Label("Enter withdraw amount: ");
            withdrawTextField=new TextField();
            Button withdrawButton= new Button("Make Withdraw");
    
            // 1a. "register" event handler for button
            depButton.setOnAction(new DepositHandler());
            withdrawButton.setOnAction(new WithdrawHandler());
    
            // 2. create layout containers
            HBox row1 = new HBox(20, bankLabel, currentBalanceLabel);
            row1.setAlignment(Pos.CENTER);
    
            HBox row2 = new HBox(20, depositLabel, depositTextField);
            row2.setPadding(new Insets(15));
            row2.setAlignment(Pos.CENTER);
            
            HBox row3= new HBox(20, withdrawLabel, withdrawTextField);
            row3.setAlignment(Pos.CENTER);
    
            VBox v = new VBox(row1, row2,row3, depButton, withdrawButton);
            v.setAlignment(Pos.CENTER);
    
            // 3. create a scene object
            Scene scene = new Scene(v, 500, 300);
    
            // 4. add the scene object to the stage
            s.setScene(scene);
            s.setTitle("Automatic Teller Machine");
            s.show();
        } // ends start method
    
        class DepositHandler implements EventHandler<ActionEvent> {
            public void handle(ActionEvent e) {
                // get input
                int amount = Integer.parseInt(depositTextField.getText());
    
                // perform the deposit
                bank.deposit(amount);
    
                // clear the deposit text field label
                depositTextField.setText("");
    
                // update the GUI balance
                currentBalanceLabel.setText("$" + bank.getBalance());
                    
            }
        } // ends the button event handler class
        class WithdrawHandler implements EventHandler<ActionEvent> {
            public void handle(ActionEvent e) {
                // get input
                int amount = Integer.parseInt(withdrawTextField.getText());
    
                // perform the withdraw
                if(amount<=bank.getBalance()){ //makes sure withdraw is less than current balance
                bank.withdraw(amount);
                }
    
                // clear the withdraw text field label
                withdrawTextField.setText("");
    
                // update the GUI balance
                currentBalanceLabel.setText("$" + bank.getBalance());
                    
            }
        }
    } // ends the outer class    
/*
Name:
Date: November 6, 2018
Title: PayRateGUI.java
Description: An example GUI program using the JavaFX framework
Input: hours worked and pay rate 
Output: calculated gross pay 
*/

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.*;

public class PayRateGUI extends Application  {

    // global controls
    TextField hoursTextField;
    TextField wageTextField;
    Label grossPayLabel;

    // "launch" method is called 
    // "launch()"" is defined in javafx.application.Application.java 
    // meaning of "extends" keyword is covered in CSC240
    public static void main(String[] args) {
        launch(args);
    }

    // "start" method is automatically called by "launch()" method
    // everything begins here
    // similar to how "public static void main" works
    public void start (Stage s) {
        // 1. create the Control objects
        // note that globals ones are declared outside of "start" method
        Label hoursLabel = new Label("# of hours worked:");
        Label wageLabel = new Label("Hourly wage:");
        hoursTextField = new TextField();
        wageTextField = new TextField();
        Button calcButton = new Button("Calculate Pay");
        grossPayLabel = new Label();   // "answer box"

        // 1a. "register" event handler for button
        calcButton.setOnAction(new CalculateHandler());

        // 2. create layout containers
        HBox row1 = new HBox(hoursLabel, hoursTextField);
        HBox row2 = new HBox(wageLabel, wageTextField);
        VBox v = new VBox(row1, row2, calcButton, grossPayLabel);

        // 3. create a scene object
        Scene scene = new Scene(v, 500, 300);

        // 4. add the scene object to the stage
        s.setScene(scene);
        s.setTitle("Gross Pay Calculator");
        s.show();
    } // ends start method

    class CalculateHandler implements EventHandler<ActionEvent> {
        public void handle(ActionEvent e) {
            // get input
            int hoursWorked = Integer.parseInt(hoursTextField.getText());
            double payRate = Double.parseDouble(wageTextField.getText());

            // calculation
            double grossPay = hoursWorked * payRate;

            // display output
            grossPayLabel.setText("$" + grossPay);
        }
    } // ends the button event handler class
} // ends the outer class

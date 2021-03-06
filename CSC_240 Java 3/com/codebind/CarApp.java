package com.codebind;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CarApp {
    // class includes all needed JComboBox's JLabel's & JPanel & JFrame
    private JPanel panelMain;
    private JComboBox comboIgnitionKey;
    private JComboBox gearShiftCombo;
    private JLabel domeLight;
    private JComboBox comboWindowChildLock;
    private JComboBox comboDriverSeat;
    private JLabel doorKeyChime;
    private JLabel wiperLabel;
    private JLabel headlightsLabel;
    private JLabel brakeLightsLabel;
    private JLabel driverWindowLabel;
    private JLabel otherWindowsLabel;
    private JLabel dashSeatbeltLabel;
    private JLabel dashDoorOpenLabel;
    private JLabel reverseLightLabel;
    private JComboBox comboDoor;
    private JComboBox domeLightSelections;
    private JComboBox headlightSwitch;
    private JCheckBox leftBlinker;
    private JCheckBox rightBlinker;
    private JLabel turnSignal;
    private JFrame frame;

    public CarApp() {
    // Includes every action listener for all of the JComboBoxes
        domeLightSelections.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(domeLightSelections.getSelectedItem() == domeLightSelections.getItemAt(1)) {
//                    domeLight.setText(domeLightSelections.getSelectedItem().toString());
                    domeLight.setForeground(Color.RED);
                }
                else {
                    domeLight.setForeground(Color.BLACK);
                }

            }
        });
        comboDoor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
            if (comboDoor.getSelectedItem() == comboDoor.getItemAt(1)) {
                dashDoorOpenLabel.setForeground(Color.PINK);
                doorKeyChime.setForeground(Color.RED);
            }
                else if (comboDoor.getSelectedItem() == comboDoor.getItemAt(2))  {
                    dashDoorOpenLabel.setForeground(Color.GRAY);
                    doorKeyChime.setForeground(Color.BLACK);
                }
            }
        });
        gearShiftCombo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
            if(gearShiftCombo.getSelectedItem() == gearShiftCombo.getItemAt(2)) {
                reverseLightLabel.setForeground(Color.RED);
                }
            else if(gearShiftCombo.getSelectedItem() == gearShiftCombo.getItemAt(1) ||
                    gearShiftCombo.getSelectedItem() == gearShiftCombo.getItemAt(3) ||
                    gearShiftCombo.getSelectedItem() == gearShiftCombo.getItemAt(4)) {
                         reverseLightLabel.setForeground(Color.BLACK);
                    }
            else if(gearShiftCombo.getSelectedItem() != gearShiftCombo.getItemAt(2)) {
                reverseLightLabel.setForeground(Color.BLACK);
            }
            if(gearShiftCombo.getSelectedItem() == gearShiftCombo.getItemAt(4) && comboDriverSeat.getSelectedItem() == comboDriverSeat.getItemAt(0) || comboDriverSeat.getSelectedItem() == comboDriverSeat.getItemAt(3) ) {
                JOptionPane.showMessageDialog(null, "Driver seat must be occupied to shift car into drive!");
                gearShiftCombo.setSelectedItem(0);
            }
            if (comboDoor.getSelectedItem() == comboDoor.getItemAt(1)) {
                JOptionPane.showMessageDialog(null, "Driver door must be closed before putting car into drive!");
            }
            }
        });
        comboIgnitionKey.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(comboIgnitionKey.getSelectedItem() == comboIgnitionKey.getItemAt(3)
                        ||comboIgnitionKey.getSelectedItem()
                        == comboIgnitionKey.getItemAt(4) ) {
                driverWindowLabel.setForeground(Color.RED);
                }
                else if (comboIgnitionKey.getSelectedItem() == comboIgnitionKey.getItemAt(1)) {
                    domeLight.setForeground(Color.BLACK);
                    doorKeyChime.setForeground(Color.BLACK);
                    reverseLightLabel.setForeground(Color.BLACK);
                    dashSeatbeltLabel.setForeground(Color.BLACK);
                    driverWindowLabel.setForeground(Color.BLACK);
                    otherWindowsLabel.setForeground(Color.BLACK);
                    dashSeatbeltLabel.setForeground(Color.BLACK);
                }
                else if(comboIgnitionKey.getSelectedItem() == comboIgnitionKey.getItemAt(2)) {
                    domeLight.setForeground(Color.BLACK);
                    doorKeyChime.setForeground(Color.RED);
                    reverseLightLabel.setForeground(Color.BLACK);
                    dashSeatbeltLabel.setForeground(Color.BLACK);
                    driverWindowLabel.setForeground(Color.BLACK);
                    otherWindowsLabel.setForeground(Color.BLACK);
                    dashSeatbeltLabel.setForeground(Color.BLACK);
                }
                else if(comboIgnitionKey.getSelectedItem() == comboIgnitionKey.getItemAt(2)
                        || comboIgnitionKey.getSelectedItem() == comboIgnitionKey.getItemAt(2)
                && comboDoor.getSelectedItem() == comboDoor.getItemAt(1)) {
                    doorKeyChime.setForeground(Color.RED);
                    dashDoorOpenLabel.setForeground(Color.PINK);
                }

            }
        });
        comboWindowChildLock.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (comboWindowChildLock.getSelectedItem() == comboWindowChildLock.getItemAt(1)) {
                    otherWindowsLabel.setForeground(Color.BLACK);
                } else if (comboWindowChildLock.getSelectedItem() == comboWindowChildLock.getItemAt(2)) {
                    otherWindowsLabel.setForeground(Color.RED);
                }
            }
        });
        comboDriverSeat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
            if(comboDriverSeat.getSelectedItem() == comboDriverSeat.getItemAt(1)
                    && comboIgnitionKey.getSelectedItem() == comboIgnitionKey.getItemAt(4)
                    && gearShiftCombo.getSelectedItem() == gearShiftCombo.getItemAt(4)
                    && comboDoor.getSelectedItem() == comboDoor.getItemAt(2)) {
                dashSeatbeltLabel.setForeground(Color.RED);
            }
            else if(comboDriverSeat.getSelectedItem() == comboDriverSeat.getItemAt(2)) {
                dashSeatbeltLabel.setForeground(Color.BLACK);
            }
            }
        });

        headlightSwitch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (headlightSwitch.getSelectedItem() == headlightSwitch.getItemAt(1)) {
                    headlightsLabel.setForeground(Color.RED);
                }
                else if(headlightSwitch.getSelectedItem() == headlightSwitch.getItemAt(3)) {
                    headlightsLabel.setText("High Beams");
                    headlightsLabel.setForeground(Color.BLUE);
                }
                else {
                    headlightsLabel.setText("Head Lights");
                    headlightsLabel.setForeground(Color.BLACK);
                }

            }
        });
        leftBlinker.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    turnSignal.setText("Turning Left");
                    turnSignal.setForeground(Color.GREEN);
                }
                else {
                    turnSignal.setText("Turn Signal");
                    turnSignal.setForeground(Color.BLACK);
                }
            }
        });
        rightBlinker.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    turnSignal.setText("Turning Right");
                    turnSignal.setForeground(Color.GREEN);
                }
                else {
                    turnSignal.setText("Turn Signal");
                    turnSignal.setForeground(Color.BLACK);
                }
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Anthony's Car Simulator");
        frame.setContentPane(new CarApp().panelMain);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(700,500));
        frame.setVisible(true);



    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}







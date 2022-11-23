import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.*;

public class swing_Prime implements ActionListener {
    JFrame framePrime;

    JPanel panelPrime;

    JTextField primeTestField;

    JLabel stringPrimelLabel, enterNumLabel, trueFalseLabel;

    // Constructor
    public swing_Prime() {
        // Create the frame and container.
        framePrime = new JFrame("Prime or Not?");
        panelPrime = new JPanel();
        panelPrime.setLayout(new GridLayout(2, 2));


        // Add the widgets.
        addWidgets();

        // Add the panel to the frame.
        framePrime.getContentPane().add(panelPrime, BorderLayout.CENTER);

        // Exit when the window is closed.
        framePrime.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Show the converter.
        framePrime.pack();
        framePrime.setVisible(true);
    }

    // Create and add the widgets for converter.
    private void addWidgets() {

        // Create widgets.
        primeTestField = new JTextField();
        primeTestField.setHorizontalAlignment(JTextField.CENTER);
        enterNumLabel = new JLabel("Enter a number:            ",
                SwingConstants.LEFT);
        stringPrimelLabel = new JLabel("Is it Prime?:  ",
                SwingConstants.LEFT);
        trueFalseLabel = new JLabel("Let's Find Out!",
                SwingConstants.CENTER);

        // Listen to events from Convert textfield.
        primeTestField.addActionListener(this);

        // Add widgets to container.
        panelPrime.add(enterNumLabel);
        panelPrime.add(primeTestField);
        panelPrime.add(stringPrimelLabel);
        panelPrime.add(trueFalseLabel);

        panelPrime.setBackground(Color.red);
    }

    // Implementation of ActionListener interface.
    public void actionPerformed(ActionEvent event) {

        int n = Integer.parseInt(primeTestField.getText());

        if (n == 2) {
            trueFalseLabel.setText("Yes");
        }
        else {
            for (int i = 2; 2*i < n; i++) {
                if(n % i == 0){
                    trueFalseLabel.setText("No");
                }
                else {
                    trueFalseLabel.setText("Yes");
                }
            }
        }
    }

    // main method
    public static void main(String[] args) {
        swing_Prime converter = new swing_Prime();
    }
}

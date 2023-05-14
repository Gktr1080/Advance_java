import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class currency extends JFrame implements ActionListener {
    private JLabel amountLabel, fromLabel, toLabel, resultLabel;
    private JTextField amountField;
    private JComboBox<String> fromCurrency, toCurrency;
    private JButton convertButton;

    public currency() {
        setTitle("Currency Converter");
        setLayout(new GridLayout(4, 2));

        amountLabel = new JLabel("Amount: ");
        amountField = new JTextField();
        fromLabel = new JLabel("From: ");
        fromCurrency = new JComboBox<>(new String[] { "USD", "EUR", "JPY", "GBP", "AUD", "CAD" });
        toLabel = new JLabel("To: ");
        toCurrency = new JComboBox<>(new String[] { "USD", "EUR", "JPY", "GBP", "AUD", "CAD" });
        resultLabel = new JLabel();
        convertButton = new JButton("Convert");

        add(amountLabel);
        add(amountField);
        add(fromLabel);
        add(fromCurrency);
        add(toLabel);
        add(toCurrency);
        add(resultLabel);
        add(convertButton);

        convertButton.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String amountString = amountField.getText();
        double amount = Double.parseDouble(amountString);
        String from = (String) fromCurrency.getSelectedItem();
        String to = (String) toCurrency.getSelectedItem();
        double result = convert(amount, from, to);
        resultLabel.setText(String.format("%.2f %s = %.2f %s", amount, from, result, to));
    }

    private double convert(double amount, String from, String to) {
        double rate = 0;
        switch (from) {
            case "USD":
                rate = 1.0;
                break;
            case "EUR":
                rate = 1.23;
                break;
            case "JPY":
                rate = 0.0091;
                break;
            case "GBP":
                rate = 1.42;
                break;
            case "AUD":
                rate = 0.77;
                break;
            case "CAD":
                rate = 0.82;
                break;
        }
        double convertedAmount = amount / rate;
        switch (to) {
            case "USD":
                rate = 1.0;
                break;
            case "EUR":
                rate = 1.23;
                break;
            case "JPY":
                rate = 0.0091;
                break;
            case "GBP":
                rate = 1.42;
                break;
            case "AUD":
                rate = 0.77;
                break;
            case "CAD":
                rate = 0.82;
                break;
        }
        return convertedAmount * rate;
    }

    public static void main(String[] args) {
        new currency();
    }
}

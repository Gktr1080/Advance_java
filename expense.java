
    import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class expense extends JFrame implements ActionListener {

    // Create components
    private JTextField expenseField = new JTextField(10);
    private JTextField amountField = new JTextField(10);
    private JTextArea expenseList = new JTextArea(10, 20);
    private JButton addButton = new JButton("Add");
    private JButton deleteButton = new JButton("Delete");

    public expense() {
        super("Expense Tracker");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Add components to the main window
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Expense:"));
        inputPanel.add(expenseField);
        inputPanel.add(new JLabel("Amount:"));
        inputPanel.add(amountField);
        inputPanel.add(addButton);
        inputPanel.add(deleteButton);
        add(inputPanel, BorderLayout.NORTH);

        JScrollPane scrollPane = new JScrollPane(expenseList);
        add(scrollPane, BorderLayout.CENTER);

        // Add action listeners to buttons
        addButton.addActionListener(this);
        deleteButton.addActionListener(this);

        // Set window size and show
        setSize(400, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            String expense = expenseField.getText();
            String amount = amountField.getText();
            expenseList.append(expense + ": " + amount + "\n");
            expenseField.setText("");
            amountField.setText("");
        } else if (e.getSource() == deleteButton) {
            int selected = expenseList.getSelectionStart();
            expenseList.replaceRange("", selected, selected + 1);
        }
    }

    public static void main(String[] args) {
        new expense();
    }
}

    


import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {

    // Initialize buttons and variables
    private JButton btnAdd, btnSubtract, btnMultiply, btnDivide, btnEquals, btnDot, btnClear, btnDelete;
    private JButton numBtn[];
    private JTextField output;
    private String previous, current, operator;

    public Calculator() {

        // Initializing the main panel
        super("Calculator");
        JPanel p = new JPanel();

        // Creating rows as subpanels
        JPanel r1 = new JPanel();
        JPanel r2 = new JPanel();
        JPanel r3 = new JPanel();
        JPanel r4 = new JPanel();
        JPanel r5 = new JPanel();

        // Initialize text field and buttons
        output = new JTextField(16);
        btnAdd = new JButton("+");
        btnSubtract = new JButton("−");
        btnMultiply = new JButton("×");
        btnDivide = new JButton("÷");
        btnEquals = new JButton("=");
        btnDot = new JButton(".");
        btnClear = new JButton("C");
        btnDelete = new JButton("D");

        // Add action listener to number buttons
        numBtn = new JButton[11];
        numBtn[10] = btnDot;
        for (int num = 0; num < numBtn.length - 1; num++) {
            numBtn[num] = new JButton(String.valueOf(num));
            numBtn[num].setFont(new Font("Arial", Font.BOLD, 20));
        }

        // Style other buttons
        btnAdd.setFont(new Font("Arial", Font.BOLD, 20));
        btnSubtract.setFont(new Font("Arial", Font.BOLD, 20));
        btnMultiply.setFont(new Font("Arial", Font.BOLD, 20));
        btnDivide.setFont(new Font("Arial", Font.BOLD, 20));
        btnEquals.setFont(new Font("Arial", Font.BOLD, 20));
        btnDot.setFont(new Font("Arial", Font.BOLD, 20));
        btnClear.setFont(new Font("Arial", Font.BOLD, 20));
        btnDelete.setFont(new Font("Arial", Font.BOLD, 20));

        // Style the output display
        output.setFont(new Font("Arial", Font.BOLD, 20));
        output.setMaximumSize(new Dimension(200, 40));
        output.setDisabledTextColor(new Color(0, 0, 0));
        output.setMargin(new Insets(0, 5, 0, 0));
        output.setText("0");

        // Set the layout of each row in the pane
        r1.setLayout(new BoxLayout(r1, BoxLayout.LINE_AXIS));
        r2.setLayout(new BoxLayout(r2, BoxLayout.LINE_AXIS));
        r3.setLayout(new BoxLayout(r3, BoxLayout.LINE_AXIS));
        r4.setLayout(new BoxLayout(r4, BoxLayout.LINE_AXIS));
        r5.setLayout(new BoxLayout(r5, BoxLayout.LINE_AXIS));

        // Add buttons to each row

        r1.add(btnClear);
        r1.add(btnDelete);
        r2.add(numBtn[7]);
        r2.add(numBtn[8]);
        r2.add(numBtn[9]);
        r2.add(btnDivide);
        r3.add(numBtn[4]);
        r3.add(numBtn[5]);
        r3.add(numBtn[6]);
        r3.add(btnMultiply);
        r4.add(numBtn[1]);
        r4.add(numBtn[2]);
        r4.add(numBtn[3]);
        r4.add(btnSubtract);
        r5.add(btnDot);
        r5.add(numBtn[0]);
        r5.add(btnEquals);
        r5.add(btnAdd);

        // Add rows to main panel and set up the frame
        p.setLayout(new BoxLayout(p, BoxLayout.PAGE_AXIS));
        p.add(Box.createRigidArea(new Dimension(0, 5)));
        p.add(output);
        p.add(Box.createRigidArea(new Dimension(0, 5)));
        p.add(r1);
        p.add(r2);
        p.add(r3);
        p.add(r4);
        p.add(r5);

        this.add(p);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setVisible(true);
    }
}
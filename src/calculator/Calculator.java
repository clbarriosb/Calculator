/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Carmen_Lucia3
 */
public class Calculator extends JFrame {

    private Container contentPane;

    private JPanel leftPanel;
    private JPanel centerPanel;
    private JPanel buttonPanel;
    private JTextField input1TextField;
    private JTextField input2TextField;
    private JLabel answerLabel;
    private JButton plusButton;
    private JButton minusButton;

    public Calculator() {

        super("Simple Calculator");

        contentPane = this.getContentPane();
        this.setSize(250, 100);

        Dimension frameSize = this.getSize();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation((screenSize.width - frameSize.width) / 2,
                (screenSize.height - frameSize.height) / 2);

        leftPanel = new JPanel();
        leftPanel.setLayout(new GridLayout(3, 1));
        leftPanel.add(new JLabel("Input 1:  "));
        leftPanel.add(new JLabel("Input 2:  "));
        leftPanel.add(new JLabel("Answer:  "));
        contentPane.add(leftPanel, BorderLayout.WEST);

        centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(3, 1));
        input1TextField = new JTextField(10);
        input2TextField = new JTextField(10);
        answerLabel = new JLabel();
        centerPanel.add(input1TextField);
        centerPanel.add(input2TextField);
        centerPanel.add(answerLabel);
        contentPane.add(centerPanel, BorderLayout.CENTER);

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(2, 1));
        plusButton = new JButton("+");
        minusButton = new JButton("-");
        buttonPanel.add(plusButton);
        buttonPanel.add(minusButton);
        contentPane.add(buttonPanel, BorderLayout.EAST);

        ActionListener l;
        l = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double d1 = new Double(input1TextField.getText()).doubleValue();
                    double d2 = new Double(input2TextField.getText()).doubleValue();

                    if (e.getSource() == plusButton) {
                        answerLabel.setText("" + (d1 + d2));
                    } else {
                        answerLabel.setText("" + (d1 - d2));
                    }
                } catch (Exception d) {
                    JOptionPane.showMessageDialog(null,
                            "Plaease fill in both numbers!");
                }
            }
        };

        plusButton.addActionListener(l);
        minusButton.addActionListener(l);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.setVisible(true);
    }
}

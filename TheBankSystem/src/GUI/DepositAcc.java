package GUI;

import Data.FileIO;
import static Data.FileIO.bank;
import Exception.AccountNotFound;
import Exception.InvalidAmount;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class DepositAcc extends JFrame {

    public DepositAcc() {
        setTitle("Deposit Account");
        setBounds(100, 100, 450, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel contentPane = new JPanel();
        contentPane.setBackground(SystemColor.activeCaption);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);
        add(contentPane);

        JLabel lblDepositAcc = new JLabel("Deposit Account");
        lblDepositAcc.setBounds(10, 11, 414, 36);
        lblDepositAcc.setFont(new Font("Serif", Font.BOLD, 16));
        lblDepositAcc.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblDepositAcc);

        JLabel lblname = new JLabel("Name");
        lblname.setFont(new Font("Serif", Font.PLAIN, 12));
        lblname.setBounds(0, 86, 106, 14);
        contentPane.add(lblname);

        JTextField txtF = new JTextField();
        txtF.setBounds(116, 83, 216, 20);
        txtF.setColumns(10);
        contentPane.add(txtF);

        JLabel lblamount = new JLabel("Amount");
        lblamount.setFont(new Font("Serif", Font.PLAIN, 12));
        lblamount.setBounds(0, 150, 111, 14);
        contentPane.add(lblamount);

        JTextField txtF1 = new JTextField();
        txtF1.setBounds(121, 147, 211, 20);
        txtF1.setColumns(10);
        contentPane.add(txtF1);

        JButton depositButton = new JButton("Deposit");
        depositButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = txtF.getText();
                double amount = Double.parseDouble(txtF1.getText());

                int ch = JOptionPane.showConfirmDialog(getComponent(0), "Confirm?");
                if (ch == 0) {
                    try {
                        FileIO.bank.deposit(name, amount);
                        JOptionPane.showMessageDialog(getComponent(0), "Success");
                        dispose();
                        txtF.setText(null);
                        txtF1.setText(null);
                    } catch (AccountNotFound e1) {
                        JOptionPane.showMessageDialog(getComponent(0), "Invalid Acccount Number");
                    } catch (InvalidAmount e2) {
                        JOptionPane.showMessageDialog(getComponent(0), "Invalid Amount");
                    } finally {
                        txtF.setText(null);
                        txtF1.setText(null);
                    }
                }
            }
        });
        depositButton.setBounds(73, 212, 89, 23);
        contentPane.add(depositButton);

        JButton resetButton = new JButton();
        resetButton.setBounds(243, 212, 89, 23);
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(getComponent(0), "Reset");
                txtF.setText(null);
                txtF1.setText(null);
            }
        });
        contentPane.add(resetButton);
    }
}

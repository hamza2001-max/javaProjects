package GUI;

import Data.FileIO;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class AddCurrentAccount extends JFrame {

    JPanel contentPane;

    public AddCurrentAccount() {
        setTitle("Add Current Account");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBackground(SystemColor.activeCaption);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);
        add(contentPane);

        JLabel label = new JLabel("Add Current Account");
        label.setBounds(10, 72, 124, 14);
        label.setFont(new Font("Serif", Font.BOLD, 16));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(label);

        JLabel lblName = new JLabel("Name");
        lblName.setBounds(10, 72, 124, 14);
        lblName.setFont(new Font("Serif", Font.PLAIN, 12));
        contentPane.add(lblName);

        JTextField txtF = new JTextField();
        txtF.setBounds(144, 69, 254, 20);
        txtF.setColumns(10);
        contentPane.add(txtF);

        JLabel lblBalance = new JLabel();
        lblBalance.setBounds(10, 118, 124, 14);
        lblBalance.setFont(new Font("Serif", Font.PLAIN, 12));
        contentPane.add(lblBalance);

        JTextField txtF1 = new JTextField();
        txtF1.setBounds(44, 115, 254, 20);
        txtF1.setColumns(10);
        contentPane.add(txtF1);

        JLabel lblTradeLicNum = new JLabel();
        lblTradeLicNum.setBounds(10, 163, 135, 14);
        lblTradeLicNum.setFont(new Font("Serif", Font.PLAIN, 12));
        contentPane.add(lblTradeLicNum);

        JTextField txtF2 = new JTextField();
        txtF2.setBounds(44, 160, 254, 20);
        txtF2.setFont(new Font("Serif", Font.PLAIN, 12));
        contentPane.add(txtF2);

        JButton addButton = new JButton("Add Button");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = txtF.getText();
                double balance = Double.parseDouble(txtF1.getText());
                String tradeLicNum = txtF2.getText();

                if (balance < 3000) {
                    JOptionPane.showMessageDialog(getComponent(0), "Not enough balance(3000).");
                    txtF.setText(null);
                    txtF1.setText(null);
                    txtF2.setText(null);
                } else {
                    if (name == null || balance <= 0 || tradeLicNum == null) {
                        JOptionPane.showMessageDialog(getComponent(0), "Invalid Input.");
                        txtF.setText(null);
                        txtF1.setText(null);
                        txtF2.setText(null);
                    } else {
                        int ch = JOptionPane.showConfirmDialog(getComponent(0), "Confirm?");
                        if (ch == 0) {
                            int index = 0;
                            try {
                                index = FileIO.bank.addAccount1(name, balance, tradeLicNum);
                            } catch (Exception e1) {
                                e1.printStackTrace();
                            }
                            DisplayList.arr.addElement(FileIO.bank.getAccounts()[index].toString());
                            JOptionPane.showMessageDialog(getComponent(0), "Success");
                            dispose();
                        } else {
                            JOptionPane.showMessageDialog(getComponent(0), "Failed");
                            txtF.setText(null);
                            txtF1.setText(null);
                            txtF2.setText(null);
                        }
                    }
                }
            }
        });
        addButton.setBounds(86, 209, 89, 23);
        contentPane.add(addButton);

        JButton resetButton = new JButton();
        resetButton.setBounds(309, 209, 89, 23);
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(getComponent(0), "Cleared");
                txtF.setText(null);
                txtF1.setText(null);
                txtF2.setText(null);
            }
        });
        contentPane.add(resetButton);
    }
}

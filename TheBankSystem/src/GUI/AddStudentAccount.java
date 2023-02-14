package GUI;

import Data.FileIO;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class AddStudentAccount extends JFrame {

    public AddStudentAccount() {
        setTitle("Add Student Acccount");
        setBounds(100, 100, 450, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel contentPane = new JPanel();
        contentPane.setBackground(SystemColor.activeCaption);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);
        add(contentPane);

        JLabel title = new JLabel();
        title.setBounds(10, 11, 414, 34);
        title.setFont(new Font("Serif", Font.BOLD, 16));
        title.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(title);

        JLabel name = new JLabel("Name");
        name.setBounds(10, 72, 124, 14);
        name.setFont(new Font("Serif", Font.PLAIN, 12));
        contentPane.add(name);

        JTextField txtF = new JTextField();
        txtF.setBounds(144, 69, 254, 20);
        txtF.setColumns(10);
        contentPane.add(txtF);

        JLabel balance = new JLabel();
        balance.setBounds(10, 118, 124, 14);
        balance.setFont(new Font("Serif", Font.PLAIN, 12));
        contentPane.add(balance);

        JTextField txtF1 = new JTextField();
        txtF1.setBounds(144, 115, 254, 20);
        txtF1.setColumns(10);
        contentPane.add(txtF1);

        JLabel InstituteName = new JLabel();
        InstituteName.setBounds(10, 163, 135, 14);
        InstituteName.setFont(new Font("Serif", Font.PLAIN, 12));
        contentPane.add(InstituteName);

        JTextField txtF2 = new JTextField();
        txtF2.setBounds(44, 160, 254, 20);
        txtF2.setColumns(10);
        contentPane.add(txtF2);

        JButton addButton = new JButton();
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = txtF.getText();
                double balance = Double.parseDouble(txtF1.getText());
                String InsName = txtF2.getText();

                if (balance < 3000) {
                    JOptionPane.showMessageDialog(getComponent(0), "Not enough balance(3000).");
                    txtF.setText(null);
                    txtF1.setText(null);
                    txtF2.setText(null);
                }
                if (name == null || balance <= 0 || InsName == null) {
                    JOptionPane.showMessageDialog(getComponent(0), "Invalid Input");
                    txtF.setText(null);
                    txtF1.setText(null);
                    txtF2.setText(null);
                } else {
                    int ch = JOptionPane.showConfirmDialog(getComponent(0), "COnfirm?");
                    if (ch == 0) {
                        int index = 0;
                        try {
                            index = FileIO.bank.addAccount3(name, balance, InsName);
                        } catch (Exception e1) {
                            e1.printStackTrace();
                        }
                        DisplayList.arr.addElement(FileIO.bank.getAccount()[index].toString());
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
        });
        addButton.setBounds(86, 209, 89, 23);
        contentPane.add(addButton);

        JButton resetButton = new JButton();
        resetButton.setBounds(309, 209, 89, 23);
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(getComponent(0), "Reset");
                txtF.setText(null);
                txtF1.setText(null);
                txtF2.setText(null);
            }

        });
        contentPane.add(resetButton);
    }
}

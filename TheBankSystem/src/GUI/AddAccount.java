package GUI;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class AddAccount extends JFrame {

    public AddAccount() {
        setTitle("Add Account");
        setBounds(100, 100, 450, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel contentPane = new JPanel();
        contentPane.setLayout(null);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setBackground(SystemColor.activeCaption);
        add(contentPane);

        JButton saveButton = new JButton("Saving Account");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!GUIForm.addSaving.isVisible()) {
                    GUIForm.addSaving.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(getComponent(0), "Is already on");
                }
                    dispose();
            }

        });
        saveButton.setBounds(118, 56, 193, 38);
        contentPane.add(saveButton);

        JButton currentButton = new JButton("Current Account");
        currentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!GUIForm.addCurrent.isVisible()) {
                    GUIForm.addCurrent.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(getComponent(0), "Is already on");
                }
            }
        });
        currentButton.setBounds(118, 124, 193, 38);
        contentPane.add(currentButton);

        JButton studentButton = new JButton("Student Account");
        studentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!GUIForm.addStudent.isVisible()) {
                    GUIForm.addStudent.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(getComponent(0), "is already on");
                }
            }
        });
        studentButton.setBounds(118, 190, 193, 38);
        contentPane.add(studentButton);

        JLabel lblAddAccount = new JLabel();
        lblAddAccount.setBounds(108, 11, 210, 34);
        lblAddAccount.setFont(new Font("Serif", Font.BOLD, 16));
        lblAddAccount.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblAddAccount);
    }
}

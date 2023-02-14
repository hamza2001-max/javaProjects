package GUI;

import Data.FileIO;
import Exception.AccountNotFound;
import Exception.ExceedingLimit;
import Exception.ExceedingWithLimit;
import Exception.InvalidAmount;
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

public class WithDrawAcc extends JFrame{
    public WithDrawAcc(){
        setTitle("Withdraw Account");
        setBounds(100, 100, 450, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setBackground(SystemColor.activeCaption);
        contentPane.setLayout(null);
        add(contentPane);
        
        JLabel lblWithDr = new JLabel("Withdraw");
        lblWithDr.setBounds(100, 100, 450, 300);
        lblWithDr.setFont(new Font("Serif", Font.BOLD, 16));
        lblWithDr.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblWithDr);
        
        JLabel lblName = new JLabel();
        lblName.setBounds(0, 86, 106, 14);
        lblName.setFont(new Font("Serif", Font.PLAIN, 12));
        contentPane.add(lblName);
        
        JTextField txtF = new JTextField();
        txtF.setBounds(116, 83, 216, 20);
        txtF.setColumns(10);
        contentPane.add(txtF);
        
        JLabel lblAmount = new JLabel();
        lblAmount.setBounds(10, 150, 96, 14);
        lblAmount.setFont(new Font("Serif", Font.PLAIN, 12));
        contentPane.add(lblAmount);
        
        JTextField txtF1 = new JTextField();
        txtF1.setBounds(116, 147, 216, 20);
        txtF1.setColumns(10);
        contentPane.add(txtF1);
        
        JButton addButton = new JButton("WithDraw");
        addButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = lblName.getText();
                double amount = Double.parseDouble(lblAmount.getText());
                int ch = JOptionPane.showConfirmDialog(getComponent(0), "Confirm?");
                if(ch == 0){
                    try{
                        FileIO.bank.WithDraw(amount, name);
                        JOptionPane.showMessageDialog(getComponent(0), "Success");
                        dispose();
                        txtF.setText(null);
                        txtF.setText(null);
                    }catch(AccountNotFound e1){
                        JOptionPane.showMessageDialog(getComponent(0), "Invalid Account number");
                    }catch(InvalidAmount e2){
                        JOptionPane.showMessageDialog(getComponent(0), "Invalid Amount");
                    }catch(ExceedingWithLimit e3){
                        JOptionPane.showMessageDialog(getComponent(0), "Amount Exceeds the limit");
                    }catch(ExceedingLimit e4){
                        JOptionPane.showMessageDialog(getComponent(0), "Ammount Exeeds the limit");
                    }
                    finally{
                        txtF.setText(null);
                        txtF1.setText(null);
                    }
                }
            }
            
            
        });
        addButton.setBounds(116, 147, 216, 20);
        contentPane.add(addButton);
        
        JButton resetButton = new JButton();
    }
}

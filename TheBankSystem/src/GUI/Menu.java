/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import Data.FileIO;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Amazon
 */
public class Menu extends JFrame{
    public Menu(){
                setTitle("Banking System");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 649, 474);
		JPanel contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setForeground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblBankingSystem = new JLabel("Banking System");
		lblBankingSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblBankingSystem.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblBankingSystem.setBounds(0, 69, 613, 59);
		contentPane.add(lblBankingSystem);
		
		FileIO.read();
		
//		JButton btnAddAccount = new JButton("Add Account");
//		btnAddAccount.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				if(!GUIForm.addaccount.isVisible())
//				{
//					GUIForm.addaccount.setVisible(true);
//				}
//				else
//				{
//					JOptionPane.showMessageDialog(getComponent(0), "Already Opened", "Warning", 0);
//				}
//				
//			}
//		});
//		btnAddAccount.setBounds(217, 162, 194, 40);
//		contentPane.add(btnAddAccount);
		
		JButton btnDepositToAccount = new JButton("Deposit To Account");
		btnDepositToAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!GUIForm.depositacc.isVisible())
				{
					GUIForm.depositacc.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(getComponent(0), "Already Opened", "Warning", 0);
				}
				
			}
		});
		btnDepositToAccount.setBounds(217, 213, 194, 33);
		contentPane.add(btnDepositToAccount);
		
		JButton btnWithdrawFromAccount = new JButton("Withdraw From Account");
		btnWithdrawFromAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!GUIForm.withdraw.isVisible())
				{
					GUIForm.withdraw.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(getComponent(0), "Already Opened", "Warning", 0);
				}
				
				
			}
			
		});
		btnWithdrawFromAccount.setBounds(217, 256, 194, 33);
		contentPane.add(btnWithdrawFromAccount);
		
		JButton btnDisplayAccountList = new JButton("Display Account List");
		btnDisplayAccountList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(!GUIForm.displayList.isVisible())
				{
					GUIForm.displayList.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(getComponent(0), "Already Opened", "Warning", 0);
				}
				
			}
		});
		btnDisplayAccountList.setBounds(217, 300, 194, 32);
		contentPane.add(btnDisplayAccountList);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(getComponent(0), "Thanks For Using") ;
				FileIO.write();
				System.exit(0);
			}
		});
		btnExit.setBounds(217, 343, 194, 33);
		contentPane.add(btnExit);
		
		JButton btnNewButton = new JButton("Add Account");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(!GUIForm.addAccount.isVisible())
			{
				GUIForm.addAccount.setVisible(true);
			}
			else
			{
				JOptionPane.showMessageDialog(getComponent(0), "Already Opened", "Warning", 0);
			}
				
				
			}
			
		});
		btnNewButton.setBounds(217, 166, 194, 36);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Menu.class.getResource("/img/1.png")));
		lblNewLabel.setBounds(397, 16, 216, 213);
		contentPane.add(lblNewLabel);
		
		//Image image=GenerateImage.toImage(true);  //this generates an image file
		ImageIcon icon = new ImageIcon("1.png");
    }
}

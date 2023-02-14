package GUI;

import Data.FileIO;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class DisplayList extends JFrame {
    public static DefaultListModel<String> arr;
    @SuppressWarnings({})
    public DisplayList() {
        setTitle("Display List Of Accounts");
        setBounds(100, 100, 450, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel contentPane = new JPanel();
        contentPane.setLayout(null);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setBackground(SystemColor.activeCaption);
        add(contentPane);

        JLabel accountList = new JLabel();
        accountList.setBounds(0, 11, 623, 31);
        accountList.setFont(new Font("Serif", Font.BOLD, 16));
        accountList.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(accountList);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setBounds(10, 66, 613, 358);
        contentPane.add(scrollPane);

        arr = new DefaultListModel();
        arr = FileIO.bank.Display();
        JList<String> list = new JList<>(arr);
        contentPane.add(list);
    }
}

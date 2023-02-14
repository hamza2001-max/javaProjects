package GUI;

import java.awt.Point;

public class GUIForm {

    public static LoginGUI login = new LoginGUI();
    public static Menu menu = new Menu();
    public static DisplayList displayList = new DisplayList();
    public static AddAccount addAccount = new AddAccount(); 
    public static AddSavingAccount addSaving = new AddSavingAccount();
    public static AddCurrentAccount addCurrent = new AddCurrentAccount();
    public static AddStudentAccount addStudent = new AddStudentAccount();
    public static DepositAcc depositacc = new DepositAcc();
    public static WithDrawAcc withdraw = new WithDrawAcc();

    public static void UpdateDisplay() {
        if (displayList.isVisible()) {
            Point O = displayList.getLocation();
            displayList.dispose();
            displayList = new DisplayList();
            displayList.setVisible(true);
            displayList.setLocation(O);
        } else {
            displayList = new DisplayList();
        }
    }
}

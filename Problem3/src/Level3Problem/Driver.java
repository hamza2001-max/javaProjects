package Level3Problem;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AddressBook adbk = new AddressBook();

        System.out.println("Do you want add contacts? (yes/no)");
        String choice1 = input.nextLine();
        if (choice1.equals("yes")) {
            adbk.ContactEntry();
        }

        System.out.println("do you want to search? (yes/no)");
        String choice2 = input.nextLine();

        if (choice2.equals("yes")) {
            adbk.search();
        }

        System.out.println("Do you want the information on birthday months? (yes/no) ");
        String choice3 = input.nextLine();

        if (choice3.equals("yes")) {
            adbk.BirthMonth();
        }
    }
}

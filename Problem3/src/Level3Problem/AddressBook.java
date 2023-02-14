package Level3Problem;

import java.util.Scanner;

public class AddressBook {

    int i;
    Date dt;
    Person psn;
    Address ad;
    Contact cont;
    Scanner input = new Scanner(System.in);
    public Contact[] arrCont = new Contact[5];

    public int addContact(Contact cont) {
        for (i = 0; i <= 5; i++) {
            if (getadbk()[i] == null) {
                break;
            }
        }
        getadbk()[i] = cont;
        return i;
    }

    public Contact[] getadbk() {
        return arrCont;
    }

    public void ContactEntry() {

        System.out.println("Enter the First name: ");
        String FName = input.nextLine();
        System.out.println("Enter the Last Name: ");
        String LName = input.nextLine();
        System.out.println("Enter the Gender of the person: ");
        String Gender = input.nextLine();

        psn = new Person(FName, LName, Gender);

        System.out.println("Enter thr name of the city: ");
        String city = input.nextLine();
        System.out.println("Enter the Street Address: ");
        String stAd = input.nextLine();
        System.out.println("Enter the name of the state: ");
        String state = input.nextLine();
        System.out.println("Enter the zip code of the city: ");
        String zipCode = input.nextLine();

        ad = new Address(city, stAd, state, zipCode);

        System.out.println("Enter the Day, Month and the year in which the person was born(D/M/Y): ");
        System.out.println("Day: ");
        String Day = input.nextLine();
        System.out.println("Month: ");
        String Month = input.nextLine();
        System.out.println("Year: ");
        String Year = input.nextLine();

        dt = new Date(Day, Month, Year);

        System.out.println("Enter your relationship with the person: ");
        String rs = input.nextLine();
        System.out.println("Enter the phone Number");
        String phNum = input.nextLine();

        cont = new Contact(FName, LName, Gender, ad, dt, rs, phNum);
        addContact(cont);

        System.out.println("Do you want to add more contacts?(yes/no) ");
        String choice = input.nextLine();

        if (choice.equals("yes")) {

            ContactEntry();
        }
    }

    public AddressBook search() {
        System.out.println("Enter the last Name of the person you want to find: ");
        String LName = input.nextLine();

        for (Contact co : arrCont) {
            if (co == null) {
                break;
            }
            if (LName.equals(co.getLName())) {
                System.out.println(co.getInfo());
            }
        }

        System.out.println("do you want to search again?(yes/no) ");
        String choice1 = input.nextLine();

        if (choice1.equals("yes")) {
            search();
        }
        return null;
    }

    public AddressBook BirthMonth() {
        System.out.println("Enter the name of the months to find birthdays: ");
        String bmonth = input.nextLine();

        for (Contact co : arrCont) {
            if (co == null) {
                break;
            }
            if (bmonth.equals(co.getBMonth())) {
                System.out.println(co.getBInfo());
            }
        }

        System.out.println("do you want to search again?(yes/no) ");
        String choice1 = input.nextLine();

        if (choice1.equals("yes")) {
            BirthMonth();
        }

        return null;
    }

}

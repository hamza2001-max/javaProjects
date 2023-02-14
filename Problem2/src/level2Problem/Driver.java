package level2Problem;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Order[] orders = new Order[20];

        boolean condition = true;
        String upc;
        int tot = 0;
        int delidat;
        int i = 0;
        while (condition) {

            System.out.println("Enter the upc code: ");
            upc = input.nextLine();

            if (upc.equals("done")) {
                break;
            }
            int price = (int) (Math.random() * (100 - 50) + 50);

            System.out.println("Enter quantity: ");
            int quantity = input.nextInt();
            input.nextLine();

            OrderItem oi = new OrderItem(upc, quantity, price);
            delidat = (int) (Math.random() * (7 - 1) + 1);

            if (delidat == 1) {
                orders[i] = new RushOrder(1);
                orders[i].addOrderItem(oi);
                tot += oi.getCost();
                i++;
            }
            if (delidat == 2) {
                orders[i] = new RushOrder(2);
                orders[i].addOrderItem(oi);
                tot += oi.getCost();
                i++;
            }
            if (delidat == 3) {
                orders[i] = new RushOrder(3);
                orders[i].addOrderItem(oi);
                tot += oi.getCost();
                i++;
            } else if (delidat > 3) {
                orders[i] = new Order();
                orders[i].addOrderItem(oi);
                tot += oi.getCost();
                i++;
            }

        }

        System.out.println("Details of the purchase: ");
        for (Order o : orders) {
            if (o == null) {
                break;
            }
            o.printOrderItem();
        }
        System.out.println("The total cost is: ");
        System.out.println(tot);
    }
}

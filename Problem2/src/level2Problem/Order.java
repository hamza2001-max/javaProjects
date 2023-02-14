package level2Problem;

import java.util.Scanner;

public class Order {

    Scanner input = new Scanner(System.in);
    public OrderItem[] item = new OrderItem[100];
    private final int iteration = 100;

    public OrderItem[] getOrderItem() {
        return item;
    }

    public int addOrderItem(OrderItem order) {
        int i;
        for (i = 0; i < iteration; i++) {
            if (getOrderItem()[i] == null) {
                break;
            } else {
                return 0;
            }
        }
        getOrderItem()[i] = order;
        return i;
    }

    public int getTotal() {
        int totalCost = 0;

        for (OrderItem oi : item) {
            if (item == null) {
                break;
            }
            totalCost += oi.getCost();
        }

        return totalCost;
    }

    public Order printOrderItem() {
        for (int i = 0; i < iteration; i++) {
            if (item[i] == null) {
                break;
            }
            System.out.println(item[i].toString());
        }
        return null;
    }
}

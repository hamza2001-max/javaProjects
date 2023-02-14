package level2Problem;

public class RushOrder extends Order {

    protected int deliveryDay;

    public RushOrder(int deliveryDay) {
        this.deliveryDay = deliveryDay;
    }

    @Override
    public int getTotal() {
        return switch (deliveryDay) {
            case 1 ->
                super.getTotal() + 25;
            case 2 ->
                super.getTotal() + 15;
            case 3 ->
                super.getTotal() + 10;
            default ->
                0;
        };
    }
}

package level2Problem;

public class OrderItem {

    private String upc;
    private int quantity;
    private int price;

    public OrderItem(String upc, int quantity, int price) {
        this.upc = upc;
        this.quantity = quantity;
        this.price = price;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getUpc() {
        return upc;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public int getQuantity() {
        return quantity;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public int getCost() {
        return quantity * price;
    }

    @Override
    public String toString() {
        return ("upc: " + upc + "\nQuantity: " + quantity + "\nPrice: " + price + "\nCost: " + getCost());
    }

}

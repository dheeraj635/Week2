
import java.util.*;

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}

interface Discountable {
    void applyDiscount(double percent);
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    private double discount;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0;
    }

    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) - discount;
    }

    public void applyDiscount(double percent) {
        discount = (getPrice() * getQuantity()) * (percent / 100);
    }

    public String getDiscountDetails() {
        return "Discount on Veg Item: " + discount;
    }
}

class NonVegItem extends FoodItem implements Discountable {
    private double discount;
    private final double extraChargeRate = 0.1;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0;
    }

    public double calculateTotalPrice() {
        double base = getPrice() * getQuantity();
        double extra = base * extraChargeRate;
        return base + extra - discount;
    }

    public void applyDiscount(double percent) {
        double base = getPrice() * getQuantity();
        discount = base * (percent / 100);
    }

    public String getDiscountDetails() {
        return "Discount on Non-Veg Item: " + discount;
    }
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();

        VegItem veg = new VegItem("Paneer Butter Masala", 200, 2);
        NonVegItem nonveg = new NonVegItem("Chicken Biryani", 250, 3);

        veg.applyDiscount(10);
        nonveg.applyDiscount(15);

        order.add(veg);
        order.add(nonveg);

        for (FoodItem item : order) {
            item.getItemDetails();
            System.out.println("Total Price: " + item.calculateTotalPrice());
            if (item instanceof Discountable) {
                System.out.println(((Discountable) item).getDiscountDetails());
            }
            System.out.println();
        }
    }
}




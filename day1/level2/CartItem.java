public class CartItem {
    String itemName;
    double price;
    int quantity;

    public void addItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        System.out.println("Item added to cart.");
    }

    public void removeItem() {
        itemName = null;
        price = 0.0;
        quantity = 0;
        System.out.println("Item removed from cart.");
    }

    public double calculateTotalCost() {
        return price * quantity;
    }

    public void displayCartDetails() {
        if (itemName != null) {
            System.out.println("Item Name : " + itemName);
            System.out.println("Price     : " + price);
            System.out.println("Quantity  : " + quantity);
            System.out.println("Total Cost: " + calculateTotalCost());
        } else {
            System.out.println("Cart is empty.");
        }
    }

    public static void main(String[] args) {
        CartItem cart = new CartItem();
        cart.addItem("Laptop", 45000.00, 1);
        System.out.println();
        cart.displayCartDetails();
        System.out.println();
        cart.removeItem();
        System.out.println();
        cart.displayCartDetails();
    }
}




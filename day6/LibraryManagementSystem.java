
import java.util.*;

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Loan Duration: " + getLoanDuration() + " days");
    }
}

interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    private boolean isReserved;
    private String borrower;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    public int getLoanDuration() {
        return 21;
    }

    public void reserveItem(String borrowerName) {
        if (!isReserved) {
            borrower = borrowerName;
            isReserved = true;
        }
    }

    public boolean checkAvailability() {
        return !isReserved;
    }
}

class Magazine extends LibraryItem implements Reservable {
    private boolean isReserved;
    private String borrower;

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    public int getLoanDuration() {
        return 7;
    }

    public void reserveItem(String borrowerName) {
        if (!isReserved) {
            borrower = borrowerName;
            isReserved = true;
        }
    }

    public boolean checkAvailability() {
        return !isReserved;
    }
}

class DVD extends LibraryItem implements Reservable {
    private boolean isReserved;
    private String borrower;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    public int getLoanDuration() {
        return 14;
    }

    public void reserveItem(String borrowerName) {
        if (!isReserved) {
            borrower = borrowerName;
            isReserved = true;
        }
    }

    public boolean checkAvailability() {
        return !isReserved;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();

        Book book = new Book("B001", "1984", "George Orwell");
        Magazine magazine = new Magazine("M001", "National Geographic", "Various");
        DVD dvd = new DVD("D001", "Inception", "Christopher Nolan");

        items.add(book);
        items.add(magazine);
        items.add(dvd);

        book.reserveItem("Alice");
        dvd.reserveItem("Bob");

        for (LibraryItem item : items) {
            item.getItemDetails();
            if (item instanceof Reservable) {
                System.out.println("Available: " + ((Reservable) item).checkAvailability());
            }
            System.out.println();
        }
    }
}


public class book {
    String title;
    String author;
    double price;
      
    public book(){
        this.title = null;
        this.author = null;
        this.price = 0.0;
    }
    public book(String title, String author,double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public static void main(String[] args) {
        book b1 = new book();    
        System.out.println("Title : "+b1.title);
        System.out.println("Author : "+b1.author);
        System.out.println("Price : "+b1.price);

        book b2 = new book("The Alchemist", "Paulo Coelho", 1000);
        System.out.println("Title : "+b2.title);
        System.out.println("Author : "+b2.author);
        System.out.println("Price : "+b2.price);

    }
}

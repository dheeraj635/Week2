public class BookLibrarySystem {

    public static class Book{

        public String ISBN;
        protected String title;
        private String author;

        public Book(String ISBN, String title, String author){
            this.ISBN = ISBN;
            this.title = title;
            this.author = author;
        }

        public String getauthor(){
            return author;
        }

        public void setauthor(String author){
            this.author = author;
        }

        public void displaybook(){
            System.out.println("ISBN : "+ISBN);
            System.out.println("Title : "+title);
            System.out.println("author : "+author);
        }
    }

    public static class EBook extends Book {

        private double size;
        public EBook (String ISBN, String title, String author, double size){
            super(ISBN, title, author);
            this.size = size;
        }

        public void displayEBook(){
            System.out.println("ISBN : "+ISBN);
            System.out.println("Title : "+title);
            System.out.println("author : "+getauthor());
            System.out.println("File Size : " + size + " MB");
        }
    }

    public static void main(String[] args) {
        Book book = new Book("978-1234567890", "Java Fundamentals", "John Doe");
        System.out.println("=== Book Details ===");
        book.displaybook();

        // Modify author using setter
        book.setauthor("Jane Smith");
        System.out.println("\nUpdated Author: " + book.getauthor());

        System.out.println("\n=== EBook Details ===");
        // EBook object
        EBook ebook = new EBook("978-0987654321", "Advanced Java", "Alice Johnson", 2.5);
        ebook.displayEBook();
    }
}

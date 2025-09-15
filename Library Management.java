class Book {
    String title, author;
    boolean isAvailable = true;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    void returnBook() {
        isAvailable = true;
        System.out.println(title + " returned.");
    }
}

public class Library {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James Gosling");
        Book b2 = new Book("Python Guide", "Guido van Rossum");

        b1.borrowBook();
        b1.borrowBook(); 
        b1.returnBook();
        b2.borrowBook();
    }
}

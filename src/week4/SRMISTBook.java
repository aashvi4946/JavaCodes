package week4;

import java.util.ArrayList;

 public class SRMISTBook {
    // Attributes
    private String title;
    private String author;
    private String isbn;

    // Constructor
    public SRMISTBook(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Getter for ISBN
    public String getIsbn() {
        return isbn;
    }

    // Method to print book details
    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println();
    }
}

class Library {
    // Collection of books
    private ArrayList<SRMISTBook> books;

    // Constructor
    public Library() {
        books = new ArrayList<>();
    }

    // Method to add a book to the collection
    public void addBook(SRMISTBook book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    // Method to remove a book from the collection by ISBN
    public void removeBook(String isbn) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getIsbn().equals(isbn)) {
                System.out.println("Book removed: " + books.get(i).getTitle());
                books.remove(i);
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found.");
    }

    // Method to print all books in the collection
    public void printAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the collection.");
        } else {
            System.out.println("Books in the collection:");
            for (SRMISTBook book : books) {
                book.printDetails();
            }
        }
    }

    public static void main(String[] args) {
        // Create a Library instance
        Library library = new Library();

        // Create a few SRMISTBook instances
        SRMISTBook book1 = new SRMISTBook("Java Programming", "John Doe", "ISBN001");
        SRMISTBook book2 = new SRMISTBook("Data Structures", "Jane Smith", "ISBN002");
        SRMISTBook book3 = new SRMISTBook("Operating Systems", "Mike Johnson", "ISBN003");

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Print all books in the library
        library.printAllBooks();

        // Remove a book from the library by ISBN
        library.removeBook("ISBN002");

        // Print all books in the library after removal
        library.printAllBooks();
    }
}




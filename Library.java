
package librarymanagementsystem;

import java.util.ArrayList;
import java.util.List;


public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(String name, String author) {
        Book book = new Book(name, author);
        books.add(book);
       
    }

    public void removeBook(String name) {
        Book bookToRemove = null;
        for (Book book : books) {
            if (book.getName().equals(name)) {
                bookToRemove = book;
                break;
            }
        }
        if (bookToRemove != null) {
            books.remove(bookToRemove);
            System.out.println("Book removed successfully.");
        } else {
            System.out.println("Book not found.");
        }
    }

    public void searchBook(String name) {
        for (Book book : books) {
            if (book.getName().equalsIgnoreCase(name)) {
                System.out.println("Book found:");
                System.out.println("Name: " + book.getName());
                System.out.println("Author: " + book.getAuthor());
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            System.out.println("List of books in the library:");
            for (Book book : books) {
                System.out.println("Name: " + book.getName());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("-----------");
            }
        }
    }

    public void borrowBook(String bookName, String studentName, String id, String takingDate, String submissionDate) {
        Book borrowedBook = null;
        for (Book book : books) {
            if (book.getName().equalsIgnoreCase(bookName) && !book.isBorrowed()) {
                borrowedBook = book;
                break;
            }
        }
        if (borrowedBook != null) {
            borrowedBook.setBorrowed(true);
            System.out.println("Book " + borrowedBook.getName() + " borrowed by " + studentName +
                    " (ID: " + id + ", Taking Date: " + takingDate + ", Submission Date: " + submissionDate + ")");
        } else {
            System.out.println("Book " + bookName + " is not available for borrowing.");
        }
    }

    public void listBorrowedBooks() {
        List<Book> borrowedBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.isBorrowed()) {
                borrowedBooks.add(book);
            }
        }
        if (borrowedBooks.isEmpty()) {
            System.out.println("No books are currently borrowed.");
        } else {
            System.out.println("List of borrowed books:");
            for (Book book : borrowedBooks) {
                System.out.println("Name: " + book.getName());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("-----------");
            }
        }
    }
}

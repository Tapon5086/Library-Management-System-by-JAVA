
package librarymanagementsystem;

import java.util.Scanner;


public class LibraryManagementSystem {
    
     private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "password";
    
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        // Adding 30 books of data
        library.addBook("Sherlocks Home", "L.M Kharren");
        library.addBook("Great Expectation", "Charles Dickens");
        library.addBook("Crime and Punishment", "Fyodor Dostoyevsky");
        library.addBook("The Return of the King", "J.R.R. Tolkien");
        library.addBook("The Three Musketeers", "Alexandre Dumas");
        library.addBook("Animal Farm", "George Orwell");
        library.addBook("20,000 Leagues Under the Sea", "Jules Verne");
        library.addBook("The Grapes of Wrath", "John Steinbeck");
        library.addBook("Black Beauty", "Anna Sewell");
        library.addBook("Peter Pan", "J.M. Barrie");
        library.addBook("The Count of Monte", "Cristo Alexandre Dumas");
        library.addBook("Pinocchio", "Carlo Collodi");
        library.addBook("The Red Badge of Courage", "Stephen Crane");
        library.addBook("The House of the Seven Gables", "Nathaniel Hawthorne");
        library.addBook("Lord Jim", "Joseph Conrad");
        library.addBook("The Red & the Black","Stendhal");
        library.addBook("The Prince and the Pauper", "Mark Twain");
        library.addBook("The Trial", "Franz Kafka");
        library.addBook("Fahrenheit 451", "Ray Bradbury");
        library.addBook("A Journey to the Center of the Earth", "Jules Verne");
        library.addBook("Gone with the Wind", "Margaret Mitchell");
        library.addBook("White Fang", "Jack London");
        library.addBook("The Vicar of Wakefield", "Oliver Goldsmith");
        library.addBook("Doctor Zhivago Boris", "Leonidovich Pasternak");
        library.addBook("Nineteen Eighty-Four", "George Orwell");
        library.addBook("Persuasion", "Jane Austen");
        library.addBook("Far from the Madding Crowed", "Thomas Hardy");
        library.addBook("The Return of Native", "Thomas Hardy");
        library.addBook("Bleak House", "Charles Dickens");
        library.addBook("OOP Master", "TP Paul");
        
        System.out.println("<<<-----Admin Panel Login----->>>");
        System.out.print("<<<<------Username: ");
        String username = scanner.nextLine();

        System.out.print("<<<<------Password: ");
        String password = scanner.nextLine();

        if (authenticate(username, password)) {
            System.out.println("<<<----Login successful!----->>>");
            System.out.println("<<<<------------------------>>>>>\n");
            
            

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book");
            System.out.println("4. List Books");
            System.out.println("5. Borrow Book");
            System.out.println("6. List Borrowed Books");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the book: ");
                    String bookName = scanner.nextLine();
                    System.out.print("Enter the name of the author: ");
                    String authorName = scanner.nextLine();
                    library.addBook(bookName, authorName);
                    System.out.println("Book added Succesfully");
                    break;
                case 2:
                    System.out.print("Enter the name of the book to remove: ");
                    String bookToRemove = scanner.nextLine();
                    library.removeBook(bookToRemove);
                    break;
                case 3:
                    System.out.print("Enter the name of the book to search: ");
                    String bookToSearch = scanner.nextLine();
                    library.searchBook(bookToSearch);
                    break;
                case 4:
                    library.listBooks();
                    break;
                case 5:
                    System.out.print("Enter the name of the book to borrow: ");
                    String bookToBorrow = scanner.nextLine();
                    System.out.print("Enter the name of the student: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Enter the ID of the student: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter the taking date: ");
                    String takingDate = scanner.nextLine();
                    System.out.print("Enter the submission date: ");
                    String submissionDate = scanner.nextLine();
                    library.borrowBook(bookToBorrow, studentName, id, takingDate, submissionDate);
                    break;
                case 6:
                    library.listBorrowedBooks();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        }
        else{
            System.out.println("<<<---Invalid username or password. Login failed.--->>>");
        }
    }
        private static boolean authenticate(String username, String password) {
        return username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD);
    }
}


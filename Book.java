
package librarymanagementsystem;


public class Book {
    
    private String name;
    private String author;
    private boolean borrowed;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
        this.borrowed = false;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }
}
    


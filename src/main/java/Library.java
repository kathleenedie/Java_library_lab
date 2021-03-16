import java.util.ArrayList;

public class Library {

    private ArrayList<Book> collection;
    private int capacity;
    private ArrayList<Librarian> librarian;

    public Library(){
        this.collection = new ArrayList<Book>();
        this.capacity = 3;
        this.librarian = new ArrayList<Librarian>();
    }

    public int bookCount(){
        return collection.size();
    }

    public void addBookToCollection(Book book){
        if (bookCount() < this.capacity) {
            this.collection.add(book);
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Book removeBookfromCollection() {
        Book bookBorrowed = null;
        if(bookCount() > 0){
            bookBorrowed = this.collection.remove(0);
        }
        return bookBorrowed;
    }

    public int librarianCount(){
        return librarian.size();
    }
}

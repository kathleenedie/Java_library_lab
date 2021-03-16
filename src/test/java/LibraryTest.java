import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Borrower borrower1;
    private Librarian librarian;

    @Before
    public void before(){
        library = new Library();
        book1 = new Book("Treasure Island", "Robert Louis Stevenson", "Adventure");
        book2 = new Book("A women is not a man", "Etaf Rum", "Fiction");
        book3 = new Book("Veg", "High Fernley Whitingstall", "Cookery");
        book4 = new Book("The Gates of Africa", "Antony Sattin", "Travel");
        borrower1 = new Borrower("Shug", 212);
        librarian = new Librarian();
    }

    @Test
    public void checkBookCount(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBookToLibrary(){
        library.addBookToCollection(book1);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void checkLibraryCapacity(){
        assertEquals(3, library.getCapacity());
    }

    @Test
    public void canAddBookToLibraryWhenCapacityIsNotReached(){
        library.addBookToCollection(book1);
        library.addBookToCollection(book2);
        assertEquals(2, library.bookCount());
    }

    @Test
    public void cannotAddBookToLibraryWhenCapacityIsReached(){
        library.addBookToCollection(book1);
        library.addBookToCollection(book2);
        library.addBookToCollection(book3);
        library.addBookToCollection(book4);
        assertEquals(3, library.bookCount());
    }

    @Test
    public void canRemoveBookFromCollectionIfBooksAvailable(){
        library.addBookToCollection(book1);
        library.addBookToCollection(book2);
        library.addBookToCollection(book3);
        library.removeBookfromCollection();
        assertEquals(2, library.bookCount());
    }

    @Test
    public void cannotRemoveBookFromCollectionIfNoStock(){
        library.removeBookfromCollection();
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canCountLibrarians(){
        assertEquals(0, library.librarianCount());
    }

    @Test
    public void canAddLibrarian(){
        library.librarianAtWork(librarian);
        assertEquals(1, library.librarianCount());
    }

}

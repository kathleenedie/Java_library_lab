import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower1;
    private Book book1;
    private Library library;

    @Before
    public void before(){
        borrower1 = new Borrower("Beryl", 213);
        book1 = new Book("Reach", "Yoga Gal", "Health");
        library = new Library();
    }

    @Test
    public void hasName(){
        assertEquals("Beryl", borrower1.getName());
    }

    @Test
    public void hasMemberNo(){
        assertEquals(213, borrower1.getMemberNo());
    }

    @Test
    public void canCountBooksOnBookShelf(){
        assertEquals(0, borrower1.countBooksOnBookShelf());
    }

    @Test
    public void canAddBookToBookShelf(){
        borrower1.addBookToBookShelf(book1);
        assertEquals(1, borrower1.countBooksOnBookShelf());
    }

    @Test
    public void canBorrowBookfromLibraryAndAddItToBookShelf(){
        library.addBookToCollection(book1);
        borrower1.canBorrowBookFromLibrary(library);
        assertEquals(0, library.bookCount());
        assertEquals(1, borrower1.countBooksOnBookShelf());
    }
}

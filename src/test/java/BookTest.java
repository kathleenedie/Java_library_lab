import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;


    @Before
    public void before(){
        book = new Book("A women is no man", "Etaf Rum", "Fiction");
    }

    @Test
    public void hasTitle(){
        assertEquals("A women is no man", book.getTitle());
    }

    @Test
    public void hasAuthor(){
        assertEquals("Etaf Rum", book.getAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals("Fiction", book.getGenre());
    }




}

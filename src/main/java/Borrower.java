import java.util.ArrayList;

public class Borrower {

    private String name;
    private int memberNo;
    private ArrayList<Book> bookShelf;

    public Borrower(String name, int memberNo) {
        this.name = name;
        this.memberNo = memberNo;
        this.bookShelf = new ArrayList<Book>();
    }

    public String getName() {
        return name;
    }

    public int getMemberNo() {
        return memberNo;
    }

    public int countBooksOnBookShelf(){
        return this.bookShelf.size();
    }

    public void addBookToBookShelf(Book book) {
        this.bookShelf.add(book);
    }

    public void canBorrowBookFromLibrary(Library library) {
        if (library.bookCount() > 0 ){
            Book bookBorrowed = library.removeBookfromCollection();
            addBookToBookShelf(bookBorrowed);
        }
    }
}

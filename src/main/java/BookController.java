import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class BookController {
    @Inject
    private BookEJB bookEJB;
    private Book book = new Book();

    public String doCreateBook() {
        bookEJB.createBook(book);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Book created", "�����" + book.getTitle() + " ���� ������� � id=" + book.getId()));
        return "newBook.xhtml";
    }

    public void doFindBookById() {
        book = bookEJB.findBookById(book.getId());
    }

    public BookEJB getBookEJB() {
        return bookEJB;
    }

    public void setBookEJB(BookEJB bookEJB) {
        this.bookEJB = bookEJB;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}

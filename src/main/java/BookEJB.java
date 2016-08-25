import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Named
@Stateless
public class BookEJB {
    @Inject
    @PersistenceContext(unitName = "PU")
    private EntityManager em;

    public Book createBook(Book book) {
        em.persist(book);
        return book;
    }

    public List<Book> findAllBooks() {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Book> criteriaQuery = builder.createQuery(Book.class);
        Root<Book> root = criteriaQuery.from(Book.class);
        criteriaQuery.select(root);
        return em.createQuery(criteriaQuery).getResultList();
    }

    public Book findBookById(Long id) {
        return em.find(Book.class, id);
    }

    public Book updateBook(Book book){
        return  em.merge(book);
    }

    public void deleteBook(Book book){
        em.remove(book);
    }
}

package subject;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Named
@Stateless
public class SubjectEJB {
    @Inject
    @PersistenceContext(unitName = "PU")
    private EntityManager em;

    public Subject createGroup(Subject subject) {
        em.persist(subject);
        return subject;
    }
}

package faculty;

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
public class FacultyEJB {
    @Inject
    @PersistenceContext(unitName = "PU")
    private EntityManager em;

    public Faculty createFaculty(Faculty faculty) {
        em.persist(faculty);
        return faculty;
    }

    public List<Faculty> findAllFaculty() {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Faculty> criteriaQuery = builder.createQuery(Faculty.class);
        Root<Faculty> root = criteriaQuery.from(Faculty.class);
        criteriaQuery.select(root);
        return em.createQuery(criteriaQuery).getResultList();
    }
}

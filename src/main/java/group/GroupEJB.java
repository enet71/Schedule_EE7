package group;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;
import java.util.List;

@Named
@Stateless
public class GroupEJB {
    @Inject
    @PersistenceContext(unitName = "PU")
    private EntityManager em;

    public Group createGroup(Group group) {
        em.persist(group);
        return group;
    }

    public List<Group> findAllGroup() {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Group> criteriaQuery = builder.createQuery(Group.class);
        Root<Group> root = criteriaQuery.from(Group.class);
        criteriaQuery.select(root);
        return em.createQuery(criteriaQuery).getResultList();
    }

    public List<Group> findGroupByFaculty(long id) {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Group> criteriaQuery = builder.createQuery(Group.class);
        Root<Group> root = criteriaQuery.from(Group.class);
        Join faculty = root.join("faculty");
        criteriaQuery.select(root).where(builder.equal(faculty.get("id"), id));
        return em.createQuery(criteriaQuery).getResultList();
    }
}

package couple;

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
public class CoupleEJB {
    @Inject
    @PersistenceContext(unitName = "PU")
    private EntityManager em;

    public List<Couple> findAllCouples() {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Couple> criteriaQuery = builder.createQuery(Couple.class);
        Root<Couple> root = criteriaQuery.from(Couple.class);
        criteriaQuery.select(root);
        return em.createQuery(criteriaQuery).getResultList();
    }

    public List<Couple> findCouple(String groupId, String dayWeek, String number) {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Couple> criteriaQuery = builder.createQuery(Couple.class);
        Root<Couple> root = criteriaQuery.from(Couple.class);
        Join group = root.join("group");
        criteriaQuery.select(root).where(builder.and(builder.equal(root.get(Couple_.dayWeek), dayWeek), builder.equal(root.get(Couple_.number), number),builder.equal(group.get("id"), groupId)));
        return em.createQuery(criteriaQuery).getResultList();
    }
}

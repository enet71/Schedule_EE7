package couple;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@RequestScoped
public class CoupleController {
    @Inject
    private CoupleEJB coupleEJB;
    private Couple couple = new Couple();
    private String group;

    public List<Couple> findCouple(String dayWeek,String number){
        return coupleEJB.findCouple(group,dayWeek,number);
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public CoupleEJB getCoupleEJB() {
        return coupleEJB;
    }

    public void setCoupleEJB(CoupleEJB coupleEJB) {
        this.coupleEJB = coupleEJB;
    }

    public Couple getCouple() {
        return couple;
    }

    public void setCouple(Couple couple) {
        this.couple = couple;
    }
}

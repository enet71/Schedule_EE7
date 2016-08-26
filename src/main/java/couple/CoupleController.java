package couple;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class CoupleController {
    @Inject
    private CoupleEJB coupleEJB;
    private Couple couple = new Couple();



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

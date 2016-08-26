package audience;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Audience {
    @Id
    private Long id;
    private String building;
    private String number;

    public Audience() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}

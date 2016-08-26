package subject;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subject {
    @Id
    private Long id;
    private String name;

    public Subject() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

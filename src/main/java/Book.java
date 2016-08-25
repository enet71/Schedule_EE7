import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
    @Id
    private Long id;
    private String title;
    private Float price;
    private String description;
    private Integer nbOfPage;
    private Boolean illustrations;

    public Book(){

    }

    public Book(Long id, String title, Float price, String description, Integer nbOfPage, Boolean illustration) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.description = description;
        this.nbOfPage = nbOfPage;
        this.illustrations = illustration;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getNbOfPage() {
        return nbOfPage;
    }

    public void setNbOfPage(Integer nbOfPage) {
        this.nbOfPage = nbOfPage;
    }

    public Boolean getIllustrations() {
        return illustrations;
    }

    public void setIllustrations(Boolean illustration) {
        this.illustrations = illustration;
    }
}

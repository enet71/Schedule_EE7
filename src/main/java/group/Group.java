package group;

import faculty.Faculty;

import javax.persistence.*;

@Entity
@Table(name = "GRP")
public class Group {
    @Id
    private Long id;
    private String name;
    private int course;
    @OneToOne
    @JoinColumn(name = "IDFACULTY")
    private Faculty faculty;

    public Group() {
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

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
}

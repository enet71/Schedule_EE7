package faculty;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class FacultyController {
    @Inject
    private FacultyEJB facultyEJB;
    private Faculty faculty = new Faculty();


    public String doCreateFaculty() {
        facultyEJB.createFaculty(faculty);
        return "main.xhtml";
    }

    public FacultyEJB getFacultyEJB() {
        return facultyEJB;
    }

    public void setFacultyEJB(FacultyEJB facultyEJB) {
        this.facultyEJB = facultyEJB;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
}

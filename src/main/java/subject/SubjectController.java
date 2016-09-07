package subject;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class SubjectController {
    @Inject
    private SubjectEJB subjectEJB;
    private Subject subject = new Subject();

    public void createSubject(){
        subjectEJB.createGroup(subject);
    }

    public SubjectEJB getSubjectEJB() {
        return subjectEJB;
    }

    public void setSubjectEJB(SubjectEJB subjectEJB) {
        this.subjectEJB = subjectEJB;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}

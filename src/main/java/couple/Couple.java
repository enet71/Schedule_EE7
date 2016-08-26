package couple;

import audience.Audience;
import group.Group;
import subject.Subject;
import teacher.Teacher;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Couple {
    @Id
    private Long id;
    @OneToOne
    @JoinColumn(name = "idsubject")
    private Subject subject;
    @OneToOne
    @JoinColumn(name = "idgroup")
    private Group group;
    @Column(name = "nmb")
    private String number;
    @OneToOne
    @JoinColumn(name = "idaudience")
    private Audience audience;
    @Column(name = "beginc")
    @Temporal(TemporalType.DATE)
    private Date begin;
    @Column(name = "endc")
    @Temporal(TemporalType.DATE)
    private Date end;
    private Integer star;
    private String dayWeek;
    @OneToOne
    @JoinColumn(name = "idteacher")
    private Teacher teacher;
    private String type;

    public Couple() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Audience getAudience() {
        return audience;
    }

    public void setAudience(Audience audience) {
        this.audience = audience;
    }

    public Date getBegin() {
        return begin;
    }

    public void setBegin(Date begin) {
        this.begin = begin;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public String getDayWeek() {
        return dayWeek;
    }

    public void setDayWeek(String dayWeek) {
        this.dayWeek = dayWeek;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

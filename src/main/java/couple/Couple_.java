package couple;

import audience.Audience;
import group.Group;
import subject.Subject;
import teacher.Teacher;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.util.Date;

@Generated("EclipceLink")
@StaticMetamodel(Couple.class)
public class Couple_ {
    public static volatile SingularAttribute<Couple, Long> id;
    public static volatile SingularAttribute<Couple, Subject> subject;
    public static volatile SingularAttribute<Couple, Group> group;
    public static volatile SingularAttribute<Couple, String> number;
    public static volatile SingularAttribute<Couple, Audience> audience;
    public static volatile SingularAttribute<Couple, Date> begin;
    public static volatile SingularAttribute<Couple, Date> end;
    public static volatile SingularAttribute<Couple, Integer> star;
    public static volatile SingularAttribute<Couple, String> dayWeek;
    public static volatile SingularAttribute<Couple, Teacher> teacher;
    public static volatile SingularAttribute<Couple, String> type;
}


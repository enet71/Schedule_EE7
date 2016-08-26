package group;

import faculty.Faculty;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated("EclipceLink")
@StaticMetamodel(Group.class)
public class Group_ {
    public static volatile SingularAttribute<Group, Long> id;
    public static volatile SingularAttribute<Group, String> name;
    public static volatile SingularAttribute<Group, Integer> course;
    public static volatile SingularAttribute<Group, Faculty> faculty;
}

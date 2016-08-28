package group;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@RequestScoped
public class GroupController {
    @Inject
    private GroupEJB groupEJB;
    private Group group = new Group();
    private String data = "0";

    public List<Group> doFindGroupsByFaculty() {
        return groupEJB.findGroupByFaculty(Long.parseLong(data));
    }

    public List<Group> findAllGroup() {
        if(data.equals("0")){
            return groupEJB.findAllGroup();
        }else {
            return groupEJB.findGroupByFaculty(Long.parseLong(data));
        }
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public GroupEJB getGroupEJB() {
        return groupEJB;
    }

    public void setGroupEJB(GroupEJB groupEJB) {
        this.groupEJB = groupEJB;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}

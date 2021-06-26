package tourclub_app;

import java.util.ArrayList;
import java.util.List;

public class Group {


    private String groupName;
    private Person groupCoach;
    private List<Person> groupMembers;
    private int groupSizeCounter;
    private int maxSize = 5;

    public String getGroupName() {
        return groupName;
    }

    public Person getGroupCoach() {
        return groupCoach;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setGroupCoach(Person groupCoach) {
        this.groupCoach = groupCoach;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int getMaxSize() {
        return maxSize;
    }

    Group(String groupName, Person groupCoach) {
        this.groupName = groupName;
        this.groupCoach = groupCoach;
        groupMembers = new ArrayList<Person>(maxSize);
        groupSizeCounter = 0;
    }

    public void addMember(Person member) {
        if (groupSizeCounter <= maxSize) {
            groupMembers.add(member);
            groupSizeCounter++;
        }
    }

    public void removeMember(Person member) {
        groupMembers.remove(member);
        groupSizeCounter--;
    }

    public int countMembers(){
        return groupSizeCounter;
    }
}

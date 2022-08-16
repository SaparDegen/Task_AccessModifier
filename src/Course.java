import java.util.Arrays;

public class Course {
    private String courseName;
    private String teacherName;
    private Group[] groups;

    public Course() {
        System.out.println("The Course class was created");
    }

    public Course(String courseName, String teacherName, Group[] groups) {
        setCourseName(courseName);
        setTeacherName(teacherName);
        setGroupsArr(groups);
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void setGroupsArr(Group[] groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Course{courseName='" + courseName + "', teacherName='" + teacherName + "', \ngroups=" + Arrays.toString(groups) + "}";
    }
}

import java.time.LocalDate;
import java.util.Arrays;

public class Group {
    private Student[] students;
    private String subject;
    private LocalDate startDate;

    public Group() {
        System.out.println("The Group class was created");
    }

    public Group(Student[] students, String subject, LocalDate startDate) {
        setStudentsArr(students);
        setSubject(subject);
        setStartDate(startDate);
    }

    public void setStudentsArr(Student[] students) {
        this.students = students;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "\nGroup{subject='" + subject + "', startDate='" + startDate + "', students=" + Arrays.toString(students) + "}";
    }
}

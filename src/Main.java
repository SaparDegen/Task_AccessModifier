import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Student student = new Student();
        Student[] students = new Student[15];
        for (int i = 0; i < students.length; i++) {
            String studentName = "Name" + (i + 1);
            String studentSurname = "Surname" + (i + 1);
            LocalDate dateOfBirth = LocalDate.of(random.nextInt(2000, 2024), random.nextInt(1, 13), random.nextInt(1,30));
            String studentEmail = studentName.charAt(0) + "_" + studentSurname + "@" + "gmail.com";
            Student student1 = new Student(studentName, studentSurname, dateOfBirth, studentEmail);
            students[i] = student1;
        }

        Student[] students1 = Arrays.copyOf(students, 5);
        Student[] students2 = Arrays.copyOfRange(students, 5, 10);
        Student[] students3 = Arrays.copyOfRange(students, 10, 15);

        Group group = new Group();
        Group group1 = new Group(students1, "Java", LocalDate.of(2022, 7, 1));
        Group group2 = new Group(students2, "JavaScript", LocalDate.of(2022, 3, 1));
        Group group3 = new Group(students3, "Pyhon", LocalDate.of(2022, 1, 1));
        Group[] groups = {group1, group2, group3};

        Course course = new Course();
        Course course1 = new Course("Peaksoft","Muhammed", groups);
        System.out.println(course1.toString());
    }
}

import java.time.LocalDate;

public class Student {
    private LocalDate dateOfBirth;
    private String name;
    private String surname;
    private String email;

    public Student() {
        System.out.println("The Student class was created");
    }

    public Student(String name, String surname, LocalDate dateOfBirth, String email) {
        if (LocalDate.now().compareTo(dateOfBirth) >= 0) {
            setStudent(name, surname, dateOfBirth, email);
        } else {
            setName("The age is negative");
        }
    }

    public void setStudent (String name, String surname, LocalDate dateOfBirth, String email) {
        if (LocalDate.now().compareTo(dateOfBirth) < 22) {
            setName(name);
            setSurname(surname);
            setDateOfBirth(dateOfBirth);
            setEmail(email);
        } else {
            setName("The student is too old");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "{" + name + ", " + surname + ", " + dateOfBirth + ", " + email + "}";
    }
}

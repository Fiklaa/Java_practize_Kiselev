package practize11.n3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student {
    private final String name;
    private final LocalDate birthDate;

    public Student(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getFormattedBirthDate(String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        return birthDate.format(formatter);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + '\'' + ", birthDate=" + getFormattedBirthDate("dd.MM.yyyy") + '}';
    }

    public static void main(String[] args) {
        Student student = new Student("Иван Иванов", LocalDate.of(2005, 10, 30));
        System.out.println(student);

        System.out.println(student.getFormattedBirthDate("yyyy-MM-dd"));
        System.out.println(student.getFormattedBirthDate("dd MMMM yyyy"));
    }
}

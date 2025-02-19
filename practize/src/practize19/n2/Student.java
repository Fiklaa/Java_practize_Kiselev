package practize19.n2;

public class Student {
    private String fullName;
    private double averageGrade;

    public Student(String fullName, double averageGrade) {
        this.fullName = fullName;
        this.averageGrade = averageGrade;
    }

    public String getFullName() {
        return fullName;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    @Override
    public String toString() {
        return "Student{name='" + fullName + "', grade=" + averageGrade + "}";
    }
}

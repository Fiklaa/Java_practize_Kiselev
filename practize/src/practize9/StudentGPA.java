package practize9;

import java.util.Comparator;

public class StudentGPA implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return Double.compare(student1.gpa, student2.gpa);
    }

    public static void quickSort(Student[] students, int low, int high, Comparator<Student> comparator) {
        if (low < high) {
            int pivotIndex = partition(students, low, high, comparator);

            quickSort(students, low, pivotIndex - 1, comparator);
            quickSort(students, pivotIndex + 1, high, comparator);
        }
    }

    private static int partition(Student[] students, int low, int high, Comparator<Student> comparator) {
        Student pivot = students[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (comparator.compare(students[j], pivot) >= 0) {
                i++;

                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
            }
        }

        Student temp = students[i + 1];
        students[i + 1] = students[high];
        students[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student("Катя", 3.9),
                new Student("Маша", 3.5),
                new Student("Гоша", 4.0),
                new Student("Коля", 3.2),
                new Student("Жора", 2.7)
        };

        StudentGPA sort = new StudentGPA();
        quickSort(students, 0, students.length - 1, sort);

        for (Student student : students) {
            System.out.println("Студент: " + student.name + ", GPA: " + student.gpa);
        }
    }
}
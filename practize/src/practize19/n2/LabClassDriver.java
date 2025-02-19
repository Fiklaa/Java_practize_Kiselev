package practize19.n2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String message) {
        super(message);
    }
}

class EmptyStringException extends Exception {
    public EmptyStringException(String message) {
        super(message);
    }
}

class LabClass {
    private List<Student> students;

    public LabClass() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public Student findStudent(String fullName) throws StudentNotFoundException, EmptyStringException {
        if (fullName == null || fullName.isEmpty()) {
            throw new EmptyStringException("Имя студента не может быть пустым!");
        }
        return students.stream()
                .filter(student -> student.getFullName().equalsIgnoreCase(fullName))
                .findFirst()
                .orElseThrow(() -> new StudentNotFoundException("Студент с именем " + fullName + " не найден."));
    }

    public void sortStudentsByGrade() {
        students.sort(Comparator.comparingDouble(Student::getAverageGrade).reversed());
    }
}

class LabClassUI {
    private LabClass labClass;
    private Scanner scanner;

    public LabClassUI() {
        this.labClass = new LabClass();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("\n--- Меню ---");
            System.out.println("1. Добавить студента");
            System.out.println("2. Найти студента по имени");
            System.out.println("3. Отсортировать студентов по среднему баллу");
            System.out.println("4. Показать список студентов");
            System.out.println("5. Выход");
            System.out.print("Ваш выбор: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> findStudent();
                case 3 -> sortStudents();
                case 4 -> displayStudents();
                case 5 -> {
                    System.out.println("Выход из программы.");
                    return;
                }
                default -> System.out.println("Неверный выбор!");
            }
        }
    }

    private void addStudent() {
        System.out.print("Введите имя студента: ");
        String name = scanner.nextLine();
        System.out.print("Введите средний балл: ");
        double grade = scanner.nextDouble();
        labClass.addStudent(new Student(name, grade));
        System.out.println("Студент добавлен.");
    }

    private void findStudent() {
        System.out.print("Введите имя студента для поиска: ");
        String name = scanner.nextLine();
        try {
            Student student = labClass.findStudent(name);
            System.out.println("Найден: " + student);
        } catch (StudentNotFoundException | EmptyStringException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }


    private void sortStudents() {
        labClass.sortStudentsByGrade();
        System.out.println("Список студентов отсортирован.");
    }

    private void displayStudents() {
        labClass.getStudents().forEach(System.out::println);
    }
}

public class LabClassDriver {
    public static void main(String[] args) {
        LabClassUI ui = new LabClassUI();
        ui.start();
    }
}

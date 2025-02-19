package practize9;

import java.util.Scanner;
import java.util.Random;

public class StudentID implements Comparable<StudentID> {
    private final int iDNumber;

    public StudentID(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    @Override
    public int compareTo(StudentID other) {
        return Integer.compare(this.iDNumber, other.iDNumber);
    }

    public static void insertionSort(StudentID[] students) {
        for (int i = 1; i < students.length; i++) {
            StudentID curr = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].compareTo(curr) > 0) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = curr;
        }
    }

    public String toString() {
        return "ID студента: " + iDNumber;
    }

    public static void main(String[] args) {
        int n;
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество студентов");
        n = scan.nextInt();

        StudentID[] students = new StudentID[n];

        System.out.println("Случайно сгенерированный набора ID студентов:");
        for (int i = 0; i < n; i++) {
            StudentID student = new StudentID(Math.abs(rand.nextInt(10, 100)));
            students[i] = student;
            System.out.println(students[i]);
        }

        insertionSort(students);

        System.out.println("Отсортированный массив студентов");
        for (StudentID student : students) {
            System.out.println(student);
        }
        scan.close();
    }
}
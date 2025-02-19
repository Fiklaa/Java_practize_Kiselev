package practize10;

import java.util.Comparator;

public class SortSpeciality implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return student1.getSpeciality().compareTo(student2.getSpeciality());
    }
}
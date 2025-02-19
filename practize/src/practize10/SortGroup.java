package practize10;

import java.util.Comparator;

public class SortGroup implements Comparator<Student>{
    @Override
    public int compare(Student student1, Student student2) {
        return student1.getGroup().compareTo(student2.getGroup());
    }
}
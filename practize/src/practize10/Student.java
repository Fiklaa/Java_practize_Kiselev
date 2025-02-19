package practize10;

public class Student {
    private String name;
    private String lastname;
    private String speciality;
    private int course;
    private String group;

    public Student(String name, String lastname, String speciality, int course, String group) {
        this.name = name;
        this.lastname = lastname;
        this.speciality = speciality;
        this.course = course;
        this.group = group;
    }

    public String getName() {
        return name;
    }
    public String getLastname() {
        return lastname;
    }
    public String getSpeciality() {
        return speciality;
    }
    public int getCourse() {
        return course;
    }
    public String getGroup() {
        return group;
    }

    public void setName(String newName) {
        this.name = newName;
    }
    public void setLastname(String newLastName) {
        this.lastname = newLastName;
    }
    public void setSpeciality(String newSpeciality) {
        this.speciality = newSpeciality;
    }
    public void setCourse(int newCourse) {
        this.course = newCourse;
    }
    public void setGroup(String newGroup) {
        this.group = newGroup;
    }

    @Override
    public String toString() {
        return "Student {" +
                "Name: '" + name + '\'' +
                ", Last Name: '" + lastname + '\'' +
                ", Speciality: '" + speciality + '\'' +
                ", Course: " + course +
                ", Group: '" + group + '\'' +
                '}';
    }
}

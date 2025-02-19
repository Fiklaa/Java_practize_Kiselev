package practize4_1;

class Learner {
    public final String name;
    public final int age;

    public Learner(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName () { return this.name; }

    public int getAge () { return this.age; }

    public String toString() {
        return "Учащийся " + this.name + " возрастом " + this.age;
    }
}

class School_student extends Learner {
    String school;
    int grade;

    public School_student(String name, int age, String school, int grade) {
        super(name, age);
        this.school = school;
        this.grade = grade;
    }

    public String getSchool () { return this.school; }

    public int getGrade () { return this.grade; }

    @Override
    public String toString() {
        return super.toString() + " учиться в школе " + this.school + " в " + this.grade + " классе";
    }
}

class University_student extends Learner {
    String unik;
    int course;

    public University_student(String name, int age, String unik, int course) {
        super(name, age);
        this.unik = unik;
        this.course = course;
    }

    public String getUniversity () { return this.unik; }

    public int getCourse () { return this.course; }

    @Override
    public String toString() {
        return super.toString() + " учиться в университете " + this.unik + " на " + this.course + " курсе";
    }
}


public class Learner_base {
    public static void main(String[] args) {
        Learner learner1 = new Learner("Катя", 15);
        System.out.println(learner1.toString());
        System.out.println();

        Learner[] mass = new Learner[4];

        mass[0] = new School_student("Пётр", 12, "ГБОУ СОШ №13", 5);
        mass[1] = new University_student("Алекс", 20, "РТУ МИРЭА", 1);
        mass[2] = new School_student("Лёша", 10, "ГБОУ Школа №1231", 11);
        mass[3] = new University_student("Николай", 22, "ВШЭ", 4);

        for (Learner i: mass) {
            System.out.println(i.toString());
        }
    }
}

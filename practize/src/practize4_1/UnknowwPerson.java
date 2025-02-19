package practize4_1;

class Person {
    final String FullName;
    final int age;

    public Person(){
        this.FullName = "Дед Пих-то";
        this.age = -1;
    }

    public Person(String FullName, int age){
        this.FullName = FullName;
        this.age = age;
    }

    public int getAge() { return this.age; }

    public String getName() { return this.FullName; }

    public void move(){
        System.out.println(this.FullName + " куда-то движется");
    }

    public void talk(String other) { System.out.println(this.FullName + " говорит c " + other); }

    public void talk(){
        System.out.println(this.FullName + " что-то говорит");
    }
}

public class UnknowwPerson {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Зубенко Михаил Петрович", 52);

        person1.move();
        person1.talk();
        person2.move();
        person2.talk();
        person2.talk("Мафиозником");
        System.out.println(person2.getName() + " возрастом " + person2.getAge());

    }

}

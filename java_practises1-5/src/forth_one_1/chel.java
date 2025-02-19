package forth_one_1;

class Person{

    private final String FullName;
    private final int age;

    public Person(){
        this.FullName = "Unknown";
        this.age = 0;
    }

    public Person(String FullName, int age){
        this.FullName = FullName;
        this.age = age;
    }

    public void move(){
        System.out.println(FullName + " движется");
    }

    public void talk(){
        System.out.println(FullName + " говорит");
    }
}

public class chel{
    public static void main(String[] args){
        Person person1 = new Person();
        Person person2 = new Person("Руслан Поломоев", 3);

        person1.talk();
        person1.move();
        person2.talk();
        person2.move();
    }
}

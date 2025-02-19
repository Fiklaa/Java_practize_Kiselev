package practize2.p5;

public class Dog {
    String name;
    int age;

    public Dog(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getName() {return this.name;}

    public void setName(String new_name) {this.name = new_name;}

    public int getAge() {return this.age;}

    public void setAge(int new_age) {this.age = new_age;}

    public int getHumanAge() {return (this.age * 7);}

    public void ToString() {System.out.println("Пёсик по кличке " + this.name + " и возрастом " + this.age);}

}

package practize13.n2;

public class PesTest {
    public static void main(String[] args) {
        Person person = new Person("Кринжконечн", "Коля", "");
        Person person2 = new Person("Жаркий", "", "Хрен");
        System.out.println(person.getFullName());
        System.out.println(person2.getFullName());
    }
}

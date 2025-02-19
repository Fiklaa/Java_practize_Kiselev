package practize13.n5;

public class Numnset {
    public static void main(String[] args) {
        // Примеры использования
        Numbers phone1 = new Numbers("+79175655655");
        Numbers phone2 = new Numbers("89175655655");
        Numbers phone3 = new Numbers("+104289652211");

        System.out.println(phone1.formatPhoneNumber());
        System.out.println(phone2.formatPhoneNumber());
        System.out.println(phone3.formatPhoneNumber());
    }
}

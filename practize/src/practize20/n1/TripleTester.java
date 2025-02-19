package practize20.n1;

public class TripleTester {
    public static void main(String[] args) {
        Triple<String, Integer, Double> triple = new Triple<>("Проверка", 42, 3.14);

        System.out.println(triple);

        triple.setFirst("Updated");
        triple.setSecond(100);
        triple.setThird(2.71);

        System.out.println(triple);
    }
}

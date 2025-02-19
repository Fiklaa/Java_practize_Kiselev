package practize20.n2;

public class TestGenericClass {
    public static void main(String[] args) {
        String firstValue = "Yes";
        Dog secondValue = new Dog();
        String thirdValue = "Hello";
        GenericClass<String, Dog, String> genericClass = new GenericClass<String, Dog, String>(
                firstValue, secondValue, thirdValue);

        genericClass.printClassNames();

        System.out.println("First: " + genericClass.getT());
        System.out.print("Second: ");
        genericClass.getValue().makeSound();
        System.out.println("Third: " + genericClass.getKey());
    }
}

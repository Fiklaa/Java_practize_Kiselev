package practize20.n3;

public class Calculator {
    public static <T extends Number, V extends Number> double sum(T a, V b) {
        return a.doubleValue() + b.doubleValue();
    }
    public static <T extends Number, V extends Number> double multiply(T a, V b) {
        return a.doubleValue() * b.doubleValue();
    }
    public static <T extends Number, V extends Number> double divide(T a, V b) {
        if (b.doubleValue() == 0.0) {
            throw new ArithmeticException("Division by zero!");
        }
        return a.doubleValue() / b.doubleValue();
    }
    public static <T extends Number, V extends Number> double subtract(T a, T b) {
        return a.doubleValue() - b.doubleValue();
    }

    public static void main(String[] args) {
        int a = 10;
        double b = 12.5;
        System.out.println(divide(a, b));
        System.out.println(sum(a, b));
        System.out.println(subtract(a, b));
        System.out.println(multiply(a, b));
    }
}

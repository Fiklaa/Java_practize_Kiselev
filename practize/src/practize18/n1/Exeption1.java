package practize18.n1;

public class Exeption1 {
    public void exceptionDemo() {
        try {
            System.out.println("try: 2 / 0\n-->result:");
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("На ноль поделили, так нельзя.");
        }
    }
}
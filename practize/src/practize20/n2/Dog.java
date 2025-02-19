package practize20.n2;

import java.io.Serializable;

public class Dog extends Animal implements Serializable {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}
package practize20.n2;

import java.io.Serializable;

public class GenericClass<T extends Comparable<T> & CharSequence, V extends Animal & Serializable, K> {
    private T t;
    private V value;
    private K key;

    public GenericClass(T t, V value, K key) {
        this.t = t;
        this.value = value;
        this.key = key;
    }

    public T getT() {
        return t;
    }

    public V getValue() {
        return value;
    }

    public K getKey() {
        return key;
    }

    public void printClassNames() {
        System.out.println("Class of parameter t: " + t.getClass().getName());
        System.out.println("Class parameter value: " + value.getClass().getName());
        System.out.println("Class parameter key: " + key.getClass().getName());
    }
}

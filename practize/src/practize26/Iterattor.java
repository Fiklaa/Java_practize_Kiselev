package practize26;

import java.util.List;
import java.util.Iterator;

public class Iterattor<T> implements Iterator<T> {
    private List<T> list;
    private int index;

    public Iterattor(List<T> list) {
        this.list = list;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new IllegalStateException("No more elements in the list");
        }
        return list.get(index++);
    }

    @Override
    public void remove() {
        if (index <= 0) {
            throw new IllegalStateException("Cannot remove element before calling next()");
        }
        list.remove(--index);
    }

    public static void main(String[] args) {
        List<String> list = List.of("A", "B", "C");
        Iterattor<String> iterator = new Iterattor<>(list);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
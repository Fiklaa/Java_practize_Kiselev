package forth_one;

public class Memory {
    final String type; // Тип памяти (DDR4, DDR5)
    final int capacity; // Объем памяти в ГБ

    public Memory(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return type + ", " + capacity + " GB";
    }
}

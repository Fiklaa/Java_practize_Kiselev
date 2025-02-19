package practize4;

public class Memory {
    final String type;
    final int capacity;

    public Memory(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return this.type;
    }

    public int getCapacity() {
        return this.capacity;
    }

    @Override
    public String toString() {
        return this.type + ", " + this.capacity + " GB";
    }
}

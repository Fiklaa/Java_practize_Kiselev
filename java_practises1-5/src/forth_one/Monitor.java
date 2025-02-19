package forth_one;

public class Monitor {
    private final String resolution; // Разрешение экрана (например, 1920x1080)
    private final double size; // Размер экрана в дюймах

    public Monitor(String resolution, double size) {
        this.resolution = resolution;
        this.size = size;
    }

    // Геттеры
    public String getResolution() {
        return resolution;
    }

    public double getSize() {
        return size;
    }

    @Override
    public String toString() {
        return size + " inch, " + resolution + " resolution";
    }
}

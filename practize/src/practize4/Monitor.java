package practize4;

public class Monitor {
    final String resolution;
    final double diagonal;

    public Monitor(String resolution, double diagonal) {
        this.resolution = resolution;
        this.diagonal = diagonal;
    }

    public String getResolution() { return this.resolution; }

    public double getDiagonal() { return this.diagonal; }

    @Override
    public String toString() { return this.diagonal + " inch, " + this.resolution + " resolution"; }
}

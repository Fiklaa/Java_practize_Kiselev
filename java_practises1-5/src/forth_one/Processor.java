package forth_one;

public class Processor {
    private final String arch;
    private final double clock_speed;
    private final int cores;

    public Processor(String arch, double clock_speed, int cores) {
        this.arch = arch;
        this.clock_speed = clock_speed;
        this.cores = cores;
    }

    public String getArchitecture() {
        return arch;
    }

    public double getClockSpeed() {
        return clock_speed;
    }

    public int getCores() {
        return cores;
    }

    @Override
    public String toString() {
        return arch + ", " + clock_speed + " GHz, " + cores + " cores";
    }
}

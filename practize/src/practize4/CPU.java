package practize4;

public class CPU {
    final String arch;
    final double clock_speed;
    final int cores;

    public CPU(String arch, double clock_speed, int cores) {
        this.arch = arch;
        this.clock_speed = clock_speed;
        this.cores = cores;
    }

    public String getArchitecture() {
        return this.arch;
    }

    public double getClockSpeed() {
        return this.clock_speed;
    }

    public int getCores() {
        return this.cores;
    }

    @Override
    public String toString() {
        return this.arch + ", " + this.clock_speed + " GHz, " + this.cores + " cores";
    }
}

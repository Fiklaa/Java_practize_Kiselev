package practize24.factory;

public class PC extends Computer {
    private final String ram;
    private String hdd;
    private final String cpu;

    public PC(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    public PC() {
        this.hdd = "{C-240 GB (80% full), D-520 GB (67% full)}";
        this.ram = "2x8 GB DDDR5";
        this.cpu = "INTEL Core I5 9400f - 330 hz";
    }

    @Override
    public String getRam() {
        return this.ram;
    }

    @Override
    public String getCpu() {
        return this.cpu;
    }

    @Override
    public String getHdd() {
        return this.hdd;
    }
}

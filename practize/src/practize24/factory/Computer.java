package practize24.factory;

public abstract class Computer {
    public abstract String getRam();

    public abstract String getCpu();

    public abstract String getHdd();

    @Override
    public String toString() {
        return "RAM= " + this.getRam() + ", " +
                "HDD= " + this.getHdd() + "," +
                " CPU= " + this.getCpu();
    }

}
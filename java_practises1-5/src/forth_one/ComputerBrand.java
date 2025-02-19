package forth_one;

public enum ComputerBrand {
    DELL("Dell Inc."),
    HP("Hewlett-Packard"),
    ASUS("ASUSTeK Computer"),
    APPLE("Apple Inc."),
    LENOVO("Lenovo Group");

    private final String fullName;

    ComputerBrand(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
}

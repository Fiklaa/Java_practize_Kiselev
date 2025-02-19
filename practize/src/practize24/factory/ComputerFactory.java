package practize24.factory;

public class ComputerFactory {

    public static Computer getComputer(String type) {
        if ("PC".equalsIgnoreCase(type)) {
            return new PC();
        }
        return null;
    }

    public static Computer getComputer(String type, String ram, String hdd, String cpu) {
        if ("Server".equalsIgnoreCase(type)) {
            return new Server(ram, hdd, cpu);
        }
        return null;
    }
}

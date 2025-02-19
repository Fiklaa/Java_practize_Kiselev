package practize24.computer;

import practize24.factory.Computer;
import practize24.factory.Server;

public class ServerFactory implements ComputerAbstractFactory {
    private String ram;
    private String hdd;
    private String cpu;

    public ServerFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        return new Server(ram, hdd, cpu);
    }
}

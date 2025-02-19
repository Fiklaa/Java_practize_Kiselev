package forth_one;

public class Computer {
    private final ComputerBrand brand;
    private final Processor processor;
    private final Memory memory;
    private final Monitor monitor;

    public Computer(ComputerBrand brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "Computer brand: " + brand.getFullName() + "\n" +
                "Processor: " + processor + "\n" +
                "Memory: " + memory + "\n" +
                "Monitor: " + monitor;
    }

    public static void main(String[] args) {
        Processor processor = new Processor("Intel Core i7", 3.5, 8);
        Memory memory = new Memory("DDR4", 16);
        Monitor monitor = new Monitor("1920x1080", 24.0);
        Computer computer = new Computer(ComputerBrand.DELL, processor, memory, monitor);

        System.out.println(computer);
    }
}

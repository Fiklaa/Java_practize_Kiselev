package practize4;

public class Computer {
    final Comp_Mark mark;
    final CPU proc;
    final Memory memo;
    final Monitor monitor;

    public Computer() {
        this.mark = Comp_Mark.ASUS;
        this.proc = new CPU("Pentium", 3.6, 4);
        this.memo = new Memory("DDR3", 8);
        this.monitor = new Monitor("HD", 15.6);
    }

    public Computer(Comp_Mark mark, CPU proc, Memory memo, Monitor monitor) {
        this.mark = mark;
        this.proc = proc;
        this.memo = memo;
        this.monitor = monitor;
    }

    public String getMark() {
        return this.mark.toString();
    }

    public void DelCommpF() {
        System.out.println("Выбранный компьютер удалён");
    }

    public String getDiscription() {
        return "\nОписание:\nНоутбук выполнен в пластиковом корпусе серого цвета.\n" +
                "Модель поставляется с предустановленной операционной системой Windows 11 Home SL.\n";
    }

    @Override
    public String toString() {
        return "Характеристики:\n" +
                "Computer mark " + this.mark.toString() + " rating: " + this.mark.getAvg_rating() + "\n" +
                "CPU: " + this.proc + "\n" +
                "Memory: " + this.memo + "\n" +
                "Monitor: " + this.monitor + "\n" +
                getDiscription();
    }

    public static void main(String[] args) {
        CPU processor = new CPU("CoffeeLake", 4.0, 8);
        Memory memory = new Memory("DDR5", 32);
        Monitor monitor = new Monitor("FHD", 27.0);
        Comp_Mark mark = Comp_Mark.HONOR;

        Computer computer = new Computer(mark, processor, memory, monitor);

        System.out.println(computer);
    }
}

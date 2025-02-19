package practize24.chairs;

public class main {
    public static void main(String[] args) {
        AbstractChairFactory Fact = new ChairFactory();

        Client client = new Client();

        VictorianChair victorianChair = Fact.createVictorianChair(100);
        client.setChair(victorianChair);
        client.sit();

        MagicChair magicChair = Fact.createMagicianChair();
        client.setChair(magicChair);
        client.sit();
        magicChair.doMagic();

        FunctionChair functionalChair = Fact.createFunctionalChair();
        client.setChair(functionalChair);
        client.sit();
        System.out.println("Результат умножения: " + functionalChair.mul(5, 5));
    }
}

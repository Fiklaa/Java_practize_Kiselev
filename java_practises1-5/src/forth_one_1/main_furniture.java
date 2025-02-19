package forth_one_1;

abstract class furniture{
    protected String name;
    protected double price;

    public furniture(String name, double price){
        this.name = name;
        this.price = price;
    }

    public abstract void description();

}

class Table extends furniture{
    private final String material;

    public Table(String name, double price, String material){
        super(name, price);
        this.material = material;
    }

    @Override
    public void description(){
        System.out.println("Стол \"" + name + "\", материал: " + material + ", цена: " + price + " руб.");
    }
}

class Chair extends furniture{
    private final  boolean hasArmsets;

    public Chair(String name, double price, boolean hasArmsets){
        super(name, price);
        this.hasArmsets = hasArmsets;
    }

    @Override
    public void description(){
        String armrestsInfo = hasArmsets ? "с подлокотниками" : "без подлокотников";
        System.out.println("Стул \"" + name + "\", " + armrestsInfo + ", цена: " + price + " руб.");
    }
}

class sofa extends furniture{
    private final int NumberOfSeats;

    public sofa(String name, double price, int NumberOfSeats){
        super(name, price);
        this.NumberOfSeats = NumberOfSeats;
    }

    @Override
    public void description(){
        System.out.println("Диван \"" + name + "\", количество мест: " + NumberOfSeats + ", цена: " + price + " руб.");
    }
}

class FurnitureShop{
    private final furniture[] inventury;

    public FurnitureShop(furniture[] inventury){
        this.inventury = inventury;
    }

    public void showInventory(){
        System.out.println("Ассортимент магазина мебели:");
        for (furniture item: inventury){
            item.description();
        }
    }
}

public class main_furniture {
    public static void main(String[] args){

        furniture table = new Table("Обеденный стол", 15000, "Дерево");
        furniture chair = new Chair("Кресло офисное", 5000, true);
        furniture sofa = new sofa("Диван угловой", 30000, 5);

        furniture[] inventory = {table, chair, sofa};

        FurnitureShop shop = new FurnitureShop(inventory);

        shop.showInventory();
    }
}

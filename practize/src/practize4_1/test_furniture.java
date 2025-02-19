package practize4_1;

abstract class furniture{
    protected String name;
    protected double price;
    protected String material;

    public furniture(String name, double price, String material){
        this.name = name;
        this.price = price;
        this.material = material;
    }

    public abstract void description();

}

class Table extends furniture{
    private final String type;

    public Table(String name, double price, String material, String type){
        super(name, price, material);
        this.type = type;
    }

    @Override
    public void description(){
        System.out.println("Стол - \"" + this.name + "\", тип: " + this.type + ", материал: " + this.material + ", цена: " + this.price + " руб.");
    }
}

class Chair extends furniture{
    private final String type_of;

    public Chair(String name, double price, String material, String type_of){
        super(name, price, material);
        this.type_of = type_of;
    }

    @Override
    public void description(){
        System.out.println("Стул - \"" + this.name + "\", " + this.type_of + ", материал: " + this.material + ", цена: " + this.price + " руб.");
    }
}

class Bed extends furniture{
    private final int NumberOfSeats;
    private final boolean foldable;

    public Bed(String name, double price, String material,  int NumberOfSeats, boolean foldable){
        super(name, price, material);
        this.NumberOfSeats = NumberOfSeats;
        this.foldable = foldable;
    }

    @Override
    public void description(){
        String otvet = foldable ? "раскладывающейся" : "нераскладывающейся";
        System.out.println("Кровать - \"" + this.name + "\", количество мест: " + this.NumberOfSeats +
                ", тип " + otvet + ", материал: " + this.material + ", цена: " + this.price + " руб.");
    }
}

class FurnitureShop{
    private final furniture[] inventury;

    public FurnitureShop(furniture[] inventury){
        this.inventury = inventury;
    }

    public void showInventory(){
        System.out.println("Ассортимент мебельного магазина:");
        for (furniture item: inventury){
            item.description();
        }
    }
}


public class test_furniture {
    public static void main(String[] args){

        furniture table = new Table("Обеденный стол",10780, "Дерево", "круглый");
        furniture chair = new Chair("Кресло гостинное", 7800, "Железо", "с наполнителем");
        furniture sofa = new Bed("Кровать королевская", 60540, "ДСП", 3, true);

        furniture[] inventory = {table, chair, sofa};

        FurnitureShop shop = new FurnitureShop(inventory);

        shop.showInventory();
    }
}

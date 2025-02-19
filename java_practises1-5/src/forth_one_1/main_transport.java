package forth_one_1;

abstract class Transport{
    protected String name;
    protected double speed;
    protected double costPerKmForPassenger;
    protected double costPerKmPerCargo;

    public Transport(String name, double speed, double costPerKmForPassenger, double costPerKmPerCargo){
        this.name = name;
        this.speed = speed;
        this.costPerKmForPassenger = costPerKmForPassenger;
        this.costPerKmPerCargo = costPerKmPerCargo;
    }

    public double calcTime(double distance){
        return distance / speed;
    }

    public abstract double calcPassengerCost(double distance, int numberOfPassengers);
    public abstract double calcCargoCost(double distance, double cargoWeight);
}

class Car extends Transport{
    public Car(String name, double speed, double costPerKmForPassenger, double costPerKmPerCargo){
        super(name, speed, costPerKmForPassenger, costPerKmPerCargo);
    }
    @Override
    public double calcPassengerCost(double distance, int numberOfPaassengers){
        return distance * costPerKmForPassenger * numberOfPaassengers;
    }

    @Override
    public double calcCargoCost(double distance, double cargoWeight){
        return distance * costPerKmPerCargo * cargoWeight;
    }
}

class Plane extends Transport{
    public Plane(String name, double speed, double costPerKmForPassenger, double costPerKmPerCargo){
        super(name, speed, costPerKmForPassenger, costPerKmPerCargo);
    }

    @Override
    public double calcPassengerCost(double distance, int numberOfPaassengers){
        return distance * costPerKmForPassenger * numberOfPaassengers;
    }

    @Override
    public double calcCargoCost(double distance, double cargoWeight){
        return distance * costPerKmPerCargo * cargoWeight;
    }
}

class Train extends Transport{
    public Train(String name, double speed, double costPerKmForPassenger, double costPerKmPerCargo){
        super(name, speed, costPerKmForPassenger, costPerKmPerCargo);
    }

    @Override
    public double calcPassengerCost(double distance, int numberOfPaassengers){
        return distance * costPerKmForPassenger * numberOfPaassengers;
    }

    @Override
    public double calcCargoCost(double distance, double cargoWeight){
        return distance * costPerKmPerCargo * cargoWeight;
    }
}

class Ship extends Transport{
    public Ship(String name, double speed, double costPerKmForPassenger, double costPerKmPerCargo){
        super(name, speed, costPerKmForPassenger, costPerKmPerCargo);
    }
    @Override
    public double calcPassengerCost(double distance, int numberOfPaassengers){
        return distance * costPerKmForPassenger * numberOfPaassengers;
    }

    @Override
    public double calcCargoCost(double distance, double cargoWeight){
        return distance * costPerKmPerCargo * cargoWeight;
    }
}

public class main_transport {
    public static void main(String[] args){
        Transport car = new Car("Автомобиль", 80, 0.5, 0.1);
        Transport plane = new Plane("Самолет", 900, 1.5, 2.0);
        Transport train = new Train("Поезд", 120, 0.3, 0.2);
        Transport ship = new Ship("Корабль", 40, 0.2, 0.05);

        double distance = 500;
        int passengers = 100;
        double cargoWeight = 2000;

        System.out.println("Расчет для: " + car.name);
        System.out.println("Время в пути: " + String.format("%.2f", car.calcTime(distance)) + " ч.");
        System.out.println("Стоимость перевозки пассажиров: " + car.calcPassengerCost(distance, passengers) + " руб.");
        System.out.println("Стоимость перевозки груза: " + car.calcCargoCost(distance, cargoWeight) + " руб.");

        System.out.println();

        System.out.println("Расчет для: " + plane.name);
        System.out.println("Время в пути: " + String.format("%.2f", plane.calcTime(distance)) + " ч.");
        System.out.println("Стоимость перевозки пассажиров: " + plane.calcPassengerCost(distance, passengers) + " руб.");
        System.out.println("Стоимость перевозки груза: " + plane.calcCargoCost(distance, cargoWeight) + " руб.");

        System.out.println();

        System.out.println("Расчет для: " + train.name);
        System.out.println("Время в пути: " + String.format("%.2f",train.calcTime(distance)) + " ч.");
        System.out.println("Стоимость перевозки пассажиров: " +train.calcPassengerCost(distance, passengers) + " руб.");
        System.out.println("Стоимость перевозки груза: " + train.calcCargoCost(distance, cargoWeight) + " руб.");

        System.out.println();

        System.out.println("Расчет для: " + ship.name);
        System.out.println("Время в пути: " + ship.calcTime(distance) + " ч.");
        System.out.println("Стоимость перевозки пассажиров: " + String.format("%.2f", ship.calcPassengerCost(distance, passengers)) + " руб.");
        System.out.println("Стоимость перевозки груза: " + ship.calcCargoCost(distance, cargoWeight) + " руб.");
    }
}

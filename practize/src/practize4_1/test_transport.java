package practize4_1;

abstract class Transport{
    protected String name;
    protected double speed;
    protected double pricePerKmForPassenger;
    protected double pricePerKmPerBaggage;

    public Transport(String name, double speed, double pricePerKmForPassenger, double pricePerKmPerBaggage){
        this.name = name;
        this.speed = speed;
        this.pricePerKmForPassenger = pricePerKmForPassenger;
        this.pricePerKmPerBaggage = pricePerKmPerBaggage;
    }

    public double getTimeOfTrip(double dist){
        return dist / speed;
    }

    public abstract double getPassengerCost(double distance, int numberOfPassengers);

    public abstract double getBaggageCost(double distance, double BaggageWeight);
}

class Car extends Transport{
    public Car(String name, double speed, double pricePerKmForPassenger, double pricePerKmPerBaggage){
        super(name, speed, pricePerKmForPassenger, pricePerKmPerBaggage);
    }
    @Override
    public double getPassengerCost(double dist, int numOfPassrs){
        return dist * this.pricePerKmForPassenger * numOfPassrs;
    }

    @Override
    public double getBaggageCost(double dist, double BaggageWeight){
        return dist * this.pricePerKmPerBaggage * BaggageWeight;
    }
}

class Plane extends Transport{
    public Plane(String name, double speed, double pricePerKmForPassenger, double pricePerKmPerBaggage){
        super(name, speed, pricePerKmForPassenger, pricePerKmPerBaggage);
    }

    @Override
    public double getPassengerCost(double dist, int numOfPassrs){
        return dist * this.pricePerKmPerBaggage * numOfPassrs;
    }

    @Override
    public double getBaggageCost(double dist, double BaggageWeight){
        return dist * this.pricePerKmPerBaggage * BaggageWeight;
    }
}

class Train extends Transport{
    public Train(String name, double speed, double pricePerKmForPassenger, double pricePerKmPerBaggage){
        super(name, speed, pricePerKmForPassenger, pricePerKmPerBaggage);
    }

    @Override
    public double getPassengerCost(double dist, int numOfPassrs){
        return dist * this.pricePerKmForPassenger * numOfPassrs;
    }

    @Override
    public double getBaggageCost(double dist, double BaggageWeight){
        return dist * this.pricePerKmPerBaggage * BaggageWeight;
    }
}

class Ship extends Transport{
    public Ship(String name, double speed, double pricePerKmForPassenger, double pricePerKmPerBaggage){
        super(name, speed, pricePerKmForPassenger, pricePerKmPerBaggage);
    }
    @Override
    public double getPassengerCost(double dist, int numOfPassrs){
        return dist * this.pricePerKmForPassenger * numOfPassrs;
    }

    @Override
    public double getBaggageCost(double dist, double BaggageWeight){
        return dist * this.pricePerKmPerBaggage * BaggageWeight;
    }
}
public class test_transport {
    public static void souft_info(String name, double time, double pass_cost, double bagg_cost) {
        System.out.println("Расчет для: " + name);
        System.out.printf("Время в пути: %.2f ч.\n", time);
        System.out.println("Стоимость перевозки для пассажиров: " + pass_cost + " руб.");
        System.out.println("Стоимость перевозки груза: " + bagg_cost + " руб.");

        System.out.println();
    }

    public static void main(String[] args){
        Transport car = new Car("Автобус Икарус", 70, 0.5, 0.1);
        Transport plane = new Plane("Самолет Airbus A-320", 900, 6.0, 2.0);
        Transport train = new Train("Поезд Сапсан", 120, 0.3, 0.2);
        Transport ship = new Ship("Корабль Titanic", 30, 0.1, 0.05);

        double distance = 1700;
        int passengers = 100;
        double BaggageWeight = 20;

        souft_info(car.name, car.getTimeOfTrip(distance), car.getPassengerCost(distance, passengers),
                car.getBaggageCost(distance, BaggageWeight));

        souft_info(plane.name, plane.getTimeOfTrip(distance), plane.getPassengerCost(distance, passengers),
                plane.getBaggageCost(distance, BaggageWeight));

        souft_info(train.name, train.getTimeOfTrip(distance), train.getPassengerCost(distance, passengers),
                train.getBaggageCost(distance, BaggageWeight));

        souft_info(ship.name, ship.getTimeOfTrip(distance), ship.getPassengerCost(distance, passengers),
                ship.getBaggageCost(distance, BaggageWeight));

    }
}

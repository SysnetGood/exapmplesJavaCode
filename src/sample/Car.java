package sample;

public class Car {

    String name;
    Vehicle [] vehicles = new Vehicle[4];
    Engine engine;
    Transmission transmission;


    public static void main(String[] args) {
        Car c = new Car();

        Car mersedes = c.createMersedes();
        Car lamborgini = c.createLamborgini();

        System.out.println(mersedes.name);
        System.out.println(lamborgini.name);

        System.out.println(mersedes.vehicles[3].nameOfVehicles);
    }

    public Car createMersedes () {
        Car mersedes = new Car();
        mersedes.name = "mersedes";
        mersedes.vehicles[0] = new Vehicle("levZad");
        mersedes.vehicles[1] = new Vehicle("pravZad");
        mersedes.vehicles[2] = new Vehicle("levPered");
        mersedes.vehicles[3] = new Vehicle("pravPered");
        mersedes.engine = new Engine();
        mersedes.transmission = new Transmission();
        return mersedes;
    }

    public Car createLamborgini () {
        Car lamborgini = new Car();
        lamborgini.name = "lamborgini";
        lamborgini.vehicles[0] = new Vehicle("levZad");
        lamborgini.vehicles[1] = new Vehicle("pravZad");
        lamborgini.vehicles[2] = new Vehicle("levPered");
        lamborgini.vehicles[3] = new Vehicle("pravPered");
        lamborgini.engine = new Engine();
        lamborgini.transmission = new Transmission();
        return lamborgini;
    }
}

class Vehicle {
    String nameOfVehicles;

    Vehicle(String nameOfVehicles) {
        this.nameOfVehicles= nameOfVehicles;
    }
}

class Engine {

}

class Transmission {

}

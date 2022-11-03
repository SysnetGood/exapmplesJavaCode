package generic.ClassworkInher;

public class Main {

    public static void main(String[] args) {
        Garage<Transport> garage = new Garage();

        garage.setTransport(new Car());
        garage.setTransport(new Podlodka());
    }
}

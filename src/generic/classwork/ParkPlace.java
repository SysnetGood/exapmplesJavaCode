package generic.classwork;

public class ParkPlace<E> {

    private E transport;

    public void setTransport(E transport) {
        this.transport = transport;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "transport=" + transport.toString() +
                '}';
    }
}

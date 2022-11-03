package generic.ClassworkInher;

import java.util.List;

public class Garage<T> {
    List<T> garage;

    public void setTransport (T transport) {
        garage.add(transport);
    }
}

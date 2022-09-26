package ternar;

import java.util.Objects;

public class Koleso {

    private double radius;

    public Koleso setRadius(double radius) {
        this.radius = radius;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Koleso koleso = (Koleso) o;
        return Double.compare(koleso.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    public String toString() {
        return "radius=" + radius;
    }
}

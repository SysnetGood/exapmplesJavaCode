package ternar;

import java.util.Objects;

public class HashAndEqualseSample {

    int x;
    String s;
    double d;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashAndEqualseSample that = (HashAndEqualseSample) o;
        return x == that.x &&
                Objects.equals(s, that.s) && d == that.d;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, s, d);
    }
}

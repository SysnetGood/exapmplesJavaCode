package nullExamples;

import java.util.HashMap;
import java.util.Map;

public class NullHashCode {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Hello");
        map.put(1, "World");

        System.out.println();
    }
}

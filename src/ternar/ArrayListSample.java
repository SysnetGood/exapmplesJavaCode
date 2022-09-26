package ternar;

import java.util.ArrayList;

public class ArrayListSample {

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList();
        arr.add("Hello");
        arr.add("world");

        arr.forEach(s -> System.out.println(s));
    }
}

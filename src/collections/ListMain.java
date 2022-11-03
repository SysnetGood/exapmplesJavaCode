package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListMain {

    public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList(5);
        List<Double[]> linkedList = new LinkedList();

        List<Double> vector = new Vector();

        Double [] array = arrayList.toArray(new Double[5]);

        for (Double d: array) {
            System.out.println(d);
        }


        linkedList.add(new Double[10]);

        Double [] array2 = linkedList.get(0);
        array2[0] = 3.5;

        for (Double [] ar: linkedList) {
            for (Double d : ar) {
                System.out.println(d);
            }
        }

        System.out.println(array.length);


    }
}

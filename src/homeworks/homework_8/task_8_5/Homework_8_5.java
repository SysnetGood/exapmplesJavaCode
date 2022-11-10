package homeworks.homework_8.task_8_5;

import java.util.ArrayList;
import java.util.List;

public class Homework_8_5 {

/*    public static void main(String[] args) {
        List<Cycle> cycles = new ArrayList<>();

        //Upcasting
        cycles.add(new Unicycle());
        cycles.add(new Bicycle());
        cycles.add(new Tricycle());

        System.out.println(cycles.get(0) instanceof Cycle);

        for (Cycle c: cycles) {
            c.ride();
        }

        //downcusting
        Unicycle unicycle =(Unicycle) cycles.get(0);
        Bicycle bicycle =(Bicycle) cycles.get(1);
        Tricycle tricycle =(Tricycle) cycles.get(2);
        unicycle.ride();
        bicycle.ride();
        tricycle.ride();

        System.out.println(unicycle instanceof Cycle);
    }*/

    public static void main(String[] args) {
        List<Cycle> cycles = new ArrayList<>();

        //Upcasting
        cycles.add(new Unicycle());
        cycles.add(new Bicycle());
        cycles.add(new Tricycle());

        for (Cycle c: cycles) {
            //c.balance();
        }

        //downcusting
        Unicycle unicycle =(Unicycle) cycles.get(0);
        Bicycle bicycle =(Bicycle) cycles.get(1);
        Tricycle tricycle =(Tricycle) cycles.get(2);
        unicycle.balance();
        bicycle.balance();
        tricycle.balance();
    }

}

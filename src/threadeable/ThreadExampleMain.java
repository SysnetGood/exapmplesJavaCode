package threadeable;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExampleMain {

/*    public static void main(String[] args) {
        System.out.println("Start programm " + LocalDateTime.now());

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("end programm " + LocalDateTime.now());
    }*/

    public static void main(String[] args) {
        Schet schet = new Schet();

        Person  p1 = new Person();
        p1.name = "Vasya";
        p1.summ  = 180;

        Person  p2 = new Person();
        p2.name = "Petya";
        p2.summ  = 180;


        ManageShet tranzakciya1 = new ManageShet(schet,p1);
        ManageShet tranzakciya2 = new ManageShet(schet,p2);

        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        service.execute(tranzakciya1);
        service.execute(tranzakciya2);

        service.shutdown();

        System.out.println("hello from main");
    }
}

package threadeable;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Schet {

    private int schetSumma = 200;
    private Lock lock = new ReentrantLock();

    public int getMyMoney(int summa) {
        lock.lock();
        if (schetSumma < summa) {
            throw  new IllegalArgumentException("Ne hvataet deneg");
        }
        schetSumma -= summa;
        System.out.println("Ja vzal " + summa);
        System.out.println("Ostatok na schetu: " +schetSumma);
        lock.lock();
        return summa;
    }
}

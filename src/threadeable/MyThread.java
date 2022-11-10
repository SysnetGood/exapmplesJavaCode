package threadeable;

public class MyThread extends Thread {
    private static          Schet schet = new Schet();


    @Override
    public void run() {
        super.run();
    }

    public int getSumm (int sum) {
        return schet.getMyMoney(sum);
    }
}

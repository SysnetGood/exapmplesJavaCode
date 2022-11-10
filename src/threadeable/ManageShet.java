package threadeable;

public class ManageShet implements Runnable {

    private Schet schet;
    private Person person;

    public ManageShet(Schet schet, Person person) {
        this.schet = schet;
        this.person = person;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.currentThread().setName("person name is: " + person.name);
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(500);
                schet.getMyMoney(person.summ);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

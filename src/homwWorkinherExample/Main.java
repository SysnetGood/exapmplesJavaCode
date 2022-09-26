package homwWorkinherExample;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Oplata pay = new Stavka () ;
        person.payment = 20;
        person.typeOfPayment = pay;
        person.countOfWorkingDay = 15;
        person.getPaymentMinusNalog();
        System.out.println(person.toString());
    }
}

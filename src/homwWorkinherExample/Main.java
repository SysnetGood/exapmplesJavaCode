package homwWorkinherExample;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Oplata pay = new Stavka () ;
        person.fio = "Иванов Иван Иванович";
        person.payment = 300;
        person.typeOfPayment = pay;
        person.countOfWorkingDay = 15;
        person.getPaymentMinusNalog();
        System.out.println(person.toString());


        Person person2 = new Person();
        Oplata pay2 = new Sdelka () ;
        person2.fio = "Петров Петр Петрович";
        person2.payment = 1800;
        person2.typeOfPayment = pay2;
        person2.getPaymentMinusNalog();
        System.out.println(person2.toString());

        Person person3 = new Person();
        Oplata pay3 = new Hours () ;
        person3.fio = "Сидоров Сидр Сидорович";
        person3.payment = 50;
        person3.countOfHours = 70;
        person3.typeOfPayment = pay3;
        person3.getPaymentMinusNalog();
        System.out.println(person3.toString());
    }
}

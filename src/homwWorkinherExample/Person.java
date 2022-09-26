package homwWorkinherExample;

public class Person {
    String fio;
    Oplata typeOfPayment;
    int payment;
    int countOfWorkingDay;
    int countOfHours;
    double totalPayment;

    public void getPaymentMinusNalog () {
        if (countOfWorkingDay != 0) {
            this.totalPayment = typeOfPayment.calculateOfPayment(payment * countOfWorkingDay);
        } else if (countOfHours != 0){
            this.totalPayment =  typeOfPayment.calculateOfPayment(payment * countOfHours);
        } else {
            this.totalPayment = typeOfPayment.calculateOfPayment(payment);
        }

        System.out.println();
    }

    @Override
    public String toString() {
        return "Person{" +
                "fio='" + fio + '\'' +
                ", typeOfPayment=" + typeOfPayment +
                ", payment=" + payment +
                ", countOfWorkingDay=" + countOfWorkingDay +
                ", countOfHours=" + countOfHours +
                ", totalPayment=" + totalPayment +
                '}';
    }
}

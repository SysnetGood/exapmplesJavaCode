package homwWorkinherExample;

public class Sdelka extends Oplata {

    public Sdelka() {
        super.nalog = 15;
        super.paymentTapeName = "Сделка";
    }

    @Override
    public double calculateOfPayment(int payment) {
        double nalogTotal = (double) payment * nalog / 100;
        return  payment - nalogTotal;
    }
}

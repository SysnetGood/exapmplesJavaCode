package homwWorkinherExample;

public class Stavka extends Oplata {

    public Stavka () {
        super.nalog = 5;
        super.paymentTapeName = "Ставка";
    }

    @Override
    public double calculateOfPayment(int payment) {
        double nalogTotal = (double) payment * nalog / 100;
        return payment - nalogTotal;    }
}

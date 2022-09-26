package homwWorkinherExample;

public class Hours extends Oplata {

    public Hours() {
        super.nalog = 20;

        super.paymentTapeName = "Почасовая";
    }

    @Override
    public double calculateOfPayment(int payment) {
        double nalogTotal = (double) payment * nalog / 100;
        return payment - nalogTotal;
    }
}

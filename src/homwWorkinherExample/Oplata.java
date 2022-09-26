package homwWorkinherExample;

public abstract class Oplata {

    String paymentTapeName;
    int nalog;

    public abstract double calculateOfPayment(int payment);

    @Override
    public String toString() {
        return "Oplata{" +
                "paymentTapeName='" + paymentTapeName + '\'' +
                ", nalog=" + nalog +
                '}';
    }
}

package sample;

public class Binary {

    public static void main(String[] args) {
        Bin b = new Bin();

        b.a = 0x230;
        b.b = 0x231;

        System.out.println("a = " + Integer.toBinaryString(b.a));
        System.out.println("b = " + Integer.toBinaryString(b.b));
        System.out.println("a | b = " + Integer.toBinaryString(b.a | b.b));
        System.out.println("a & b = " + Integer.toBinaryString(b.a & b.b));
        System.out.println("a ^ b = " + Integer.toBinaryString(b.a ^ b.b));
        System.out.println("~a = " + Integer.toBinaryString(~b.a));
        System.out.println("b.a >> 1 = " + Integer.toBinaryString(b.a >> 1));
        System.out.println("b.a << 1 = " + Integer.toBinaryString(b.a << 1));
        System.out.println("-b.a >>> 1 = " + Integer.toBinaryString(-b.a >>> 1));
    }
}

class Bin {
    int a;
    int b;
}

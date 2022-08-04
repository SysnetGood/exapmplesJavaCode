package sample;

public class Example {

    public static void main(String[] args) {

        int numberOfLine = 10;

        for (int i = 0; i < 10; i++) {

            for (int j = numberOfLine; j > 0; j--) {
                System.out.print(" ");
            }
            numberOfLine--;
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}

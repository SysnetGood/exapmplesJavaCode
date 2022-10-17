package exception;

import java.io.FileNotFoundException;

public class FirstExceptionExample {

    public static void main(String... args) {

        FirstExceptionExample firstExceptionExample = new FirstExceptionExample();


        firstExceptionExample.delenie(1.5, 0);


        System.out.println("Message after method");

    }


    public double delenie(double x, double y) throws IndexOutOfBoundsException, ArrayIndexOutOfBoundsException {
        if (x == 0) {
            throw new IndexOutOfBoundsException("Delenie na nol nelza");
        } else if (y == 0) {
            throw new ArrayIndexOutOfBoundsException();
        } else if (x == 4) {
            return x / y;
        }
        throw new RuntimeException();
    }
}

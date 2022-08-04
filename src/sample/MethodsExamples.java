package sample;

public class MethodsExamples {

    public static String returnStringHelloWorld () {
        return "Hello world 1";
    }

    public static String returnStringHelloWorldUsingVar () {
        String helloWorld = "Hello world 2";
        return helloWorld;
    }

    public void sayMew () {
        System.out.println("Mew-Mew");
    }

    public void checkReturn () {
        if (3 > 4) {
            System.out.println("ku-ku");
        } else if (4<5) {
            System.out.println("Row-row");
            return;
        }
    }

    public static void main(String[] args) {
        String hw1 =MethodsExamples.returnStringHelloWorld();
        String hw2 = MethodsExamples.returnStringHelloWorldUsingVar();

        System.out.println(
                MethodsExamples.returnStringHelloWorld() + " from methods input var"
        );

        System.out.println(hw1);
        System.out.println(hw2);

        MethodsExamples methodsExamples = new MethodsExamples();
        methodsExamples.sayMew();

        for (int i = 0; i < 5; i++) {
            int maxNumber =4;
        }

        int maxNumber = 3;
        methodsExamples.showNumber(maxNumber);

    }

    public void showNumber (int maxNumber) {
        System.out.println(maxNumber);
    }


}

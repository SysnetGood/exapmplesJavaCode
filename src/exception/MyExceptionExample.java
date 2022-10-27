package exception;

public class MyExceptionExample {

    public static void main(String[] args) {
        MyExceptionExample myExceptionExample = new MyExceptionExample();

        //checked
        try {
            myExceptionExample.myMethodWithMyCheckedException();
        } catch (MyCheckedException e) {
            System.out.println(e.getMessage());
        }

        try {
            myExceptionExample.myMethodWithMyUncheckedException();
        } catch (MyUncheckedException e) {
            System.out.println(e.getMessage());
        }
    }

    public void myMethodWithMyCheckedException () throws MyCheckedException {
        throw new MyCheckedException("Hello from my checked exception");
    }

    public void myMethodWithMyUncheckedException () throws MyUncheckedException {
        throw  new MyUncheckedException("Hello from my unchecked exception");
    }
}
